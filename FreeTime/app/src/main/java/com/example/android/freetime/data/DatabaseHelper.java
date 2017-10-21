package com.example.android.freetime.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.android.freetime.models.User;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by sungbae on 10/16/17.
 */

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static DatabaseHelper dbInstance;

    private static final String DATABASE_NAME = "FreeTime.db";
    private static final int DATABASE_VERSION = 1;

    private RuntimeExceptionDao<User, Integer> userDao = null;

    private DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static synchronized DatabaseHelper getInstance(Context context) {
        if (dbInstance == null)
            dbInstance = new DatabaseHelper(context.getApplicationContext());
        return dbInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {
        try {
            Log.i(DatabaseHelper.class.getName(), "onUpgrade");
            TableUtils.dropTable(connectionSource, User.class, true);
            // after we drop the old databases, we create the new ones
            onCreate(sqLiteDatabase, connectionSource);
        } catch (SQLException e) {
            Log.e(DatabaseHelper.class.getName(), "Can't drop databases", e);
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns the Database Access Object (DAO) for our SimpleData class. It will create it or just give the cached
     * value.
     */
    public RuntimeExceptionDao<User, Integer> getUserDao() {
        if (userDao == null) {
            userDao = getRuntimeExceptionDao(User.class);
        }
        return userDao;
    }

    @Override
    public void close() {
        super.close();
        userDao = null;
    }
}
