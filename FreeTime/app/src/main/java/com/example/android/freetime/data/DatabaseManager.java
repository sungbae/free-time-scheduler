package com.example.android.freetime.data;

import android.content.Context;

/**
 * Created by sungbae on 10/18/17.
 */

public class DatabaseManager {

    private static DatabaseManager dbInstance;

    private DatabaseHelper dbHelper;

    private DatabaseManager(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    public static synchronized DatabaseManager getInstance(Context context) {
        if (dbInstance == null)
            dbInstance = new DatabaseManager(context);
        return dbInstance;
    }

    public DatabaseHelper getHelper() {
        return dbHelper;
    }
}
