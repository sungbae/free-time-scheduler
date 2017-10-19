package com.example.android.freetime.data;

import android.content.Context;

/**
 * Created by sungbae on 10/18/17.
 */

public class DatabaseManager {

    private static DatabaseManager dbInstance;

    private DatabaseHelper dbHelper;


    public static synchronized DatabaseManager getInstance(Context context) {
        if (dbInstance == null)
            dbInstance = new DatabaseManager(context);
        return dbInstance;
    }

    private DatabaseManager(Context context)
    {
        dbHelper = new DatabaseHelper(context);
    }
    public DatabaseHelper getHelper()
    {
        return dbHelper;
    }
}
