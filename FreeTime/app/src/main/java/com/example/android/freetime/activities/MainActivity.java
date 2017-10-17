package com.example.android.freetime.activities;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.freetime.R;
import com.example.android.freetime.data.HelloAndroid;
import com.example.android.freetime.data.MyDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.templabel);

        MyDatabase db = new MyDatabase(this);
        Cursor user = db.getUsers();
        String firstName = user.getString(0);
        String lastName = user.getString(1);
        textView.setText("Hello " + firstName + " " + lastName + "!");
        HelloAndroid hello = new HelloAndroid();
        String userNames = hello.getAllUserNames();
        textView.setText("Hello " + userNames);
        textView.setText("why you no");
        HelloAndroid hello = new HelloAndroid(); */
    }
}
