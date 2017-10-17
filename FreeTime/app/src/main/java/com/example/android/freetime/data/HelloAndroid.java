package com.example.android.freetime.data;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;

import com.example.android.freetime.R;
import com.example.android.freetime.dao.User;
import com.example.android.freetime.util.DatabaseHelper;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import java.util.List;
import java.util.Random;

/**
 * Created by sungbae on 10/15/17.
 */

public class HelloAndroid extends OrmLiteBaseActivity<DatabaseHelper> {

    private final String LOG_TAG = getClass().getSimpleName();

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.templabel);
        Log.i(LOG_TAG, "creating " + getClass() + " at " + System.currentTimeMillis());
        getAllUserNames(tv);
    }

    /**
     * Do our sample database stuff.
     */
    public void getAllUserNames(TextView textView) {
        // get our dao
        RuntimeExceptionDao<User, Integer> userDao = getHelper().get_userRuntimeDao();
        // query for all of the data objects in the database
        List<User> allUsers = userDao.queryForAll();

        String userNames = "";
        for (User user : allUsers) {
            userNames += user.FirstName + ", ";
        }

        userNames = userNames.substring(0, userNames.length() - 2);



        textView.setText("Hello " + userNames);
    }
}
