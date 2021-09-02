package pl.zaworov.dao;

import pl.zaworov.beans.User;

public interface UserDao {
    public User read(long id);
    public boolean save(User user);
}
