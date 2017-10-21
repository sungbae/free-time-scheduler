package com.example.android.freetime.repo;

import android.content.Context;

import com.example.android.freetime.models.User;
import com.example.android.freetime.data.DatabaseHelper;

import java.util.List;

/**
 * Created by sungbae on 10/18/17.
 */

public class UserRepo implements IRepository {

    private DatabaseHelper dbHelper;

    public UserRepo(Context context) {
        dbHelper = DatabaseHelper.getInstance(context);
    }

    public List<User> getAll() {
        return dbHelper.getUserDao().queryForAll();
    }
}
