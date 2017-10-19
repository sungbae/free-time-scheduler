package com.example.android.freetime.repo;

import android.content.Context;

import com.example.android.freetime.models.User;
import com.example.android.freetime.data.DatabaseHelper;
import com.example.android.freetime.data.DatabaseManager;

import java.util.List;

/**
 * Created by sungbae on 10/18/17.
 */

public class UserRepo implements IRepository {

    private DatabaseHelper dbHelper;

    public UserRepo(Context context) {
        dbHelper = DatabaseManager.getInstance(context).getHelper();
    }

    public List<User> getAll() {
        return dbHelper.get_userRuntimeDao().queryForAll();
    }
}
