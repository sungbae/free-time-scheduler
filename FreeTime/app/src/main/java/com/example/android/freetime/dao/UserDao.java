package com.example.android.freetime.dao;

import com.example.android.freetime.models.User;

import java.util.List;

/**
 * Created by sungbae on 10/15/17.
 */

public class UserDao implements IUserDao {

    private List<User> _users;

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUser(int userId) {
        return null;
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }
}
