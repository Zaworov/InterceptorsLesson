package pl.zaworov;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import pl.zaworov.beans.User;
import pl.zaworov.dao.UserDao;

public class Main {
    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        UserDao userDao = container.select(UserDao.class).get();
        User user = userDao.read(25L);
        System.out.println(user);

        container.shutdown();
    }
}