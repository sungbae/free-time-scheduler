package com.example.android.freetime;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.templabel);
        MyDatabase db = new MyDatabase(this);
        Cursor user = db.getUsers();
        String firstName = user.getString(0);
        String lastName = user.getString(1);
        tv.setText("Hello " + firstName + " " + lastName + "!");
    }
}
