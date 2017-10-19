package com.example.android.freetime.repo;

import android.content.Context;

import com.example.android.freetime.models.User;
import com.example.android.freetime.data.DatabaseHelper;
import com.example.android.freetime.data.DatabaseManager;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by sungbae on 10/18/17.
 */

public class UserRepo implements IRepository {

    private DatabaseHelper dbHelper;

    public UserRepo(Context context) {
        dbHelper = DatabaseManager.getInstance(context).getHelper();
    }

    @Override
    public int create(Object item) {
        int success = -1;
        User user = (User) item;
        try{
            success = dbHelper.get_userDao().create(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public int update(Object item) {
        return 0;
    }

    @Override
    public int delete(Object item) {
        return 0;
    }

    @Override
    public Object findById(int id) {
        return null;
    }

    public List<User> findAll() {
        return dbHelper.get_userRuntimeDao().queryForAll();
    }
}
