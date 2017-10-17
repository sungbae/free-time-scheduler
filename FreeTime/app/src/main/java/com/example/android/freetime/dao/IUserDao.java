package com.example.android.freetime.dao;

import com.example.android.freetime.models.User;

import java.util.List;

/**
 * Created by sungbae on 10/15/17.
 */

public interface IUserDao {
    List<User> getAllUsers();
    User getUser(int userId);
    void deleteUser(User user);
    void updateUser(User user);
}
