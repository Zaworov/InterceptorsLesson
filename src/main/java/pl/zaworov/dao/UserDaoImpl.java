package pl.zaworov.dao;

import pl.zaworov.beans.User;
import pl.zaworov.interceptors.TimeLogger;

import java.util.Random;

//@TimeLogger also here possible
public class UserDaoImpl implements UserDao {

    @Override
    @TimeLogger
    public User read(long id) {
        randomPause();
        return new User(id, "Jan", "Kowalski");
    }

    @Override
    public boolean save(User user) {
        return true;
    }

    private void randomPause() {
        int pause = new Random().nextInt(1000);
        try {
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
