package com.example.android.freetime.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.freetime.R;
import com.example.android.freetime.models.User;
import com.example.android.freetime.repo.UserRepo;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.templabel);

        UserRepo userRepo = new UserRepo(this);
        List<User> users = userRepo.getAll();
        String userNames = "";
        for (User user : users) {
            userNames += user.FirstName + ", ";
        }

        userNames = userNames.substring(0, userNames.length() - 2);

        textView.setText(userNames);
    }
}
