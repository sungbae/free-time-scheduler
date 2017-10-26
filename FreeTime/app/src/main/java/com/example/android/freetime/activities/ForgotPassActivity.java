package com.example.android.freetime.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.freetime.R;

public class ForgotPassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);

        AutoCompleteTextView mEmailView = (AutoCompleteTextView)findViewById(R.id.emailAutoComplete);
        mEmailView.setText(getString(R.string.text_email));
        mEmailView.setVisibility(true ? View.VISIBLE : View.GONE);

        TextView mEnterEmail = (TextView)findViewById(R.id.enterEmailText);
        mEnterEmail.setText(getString(R.string.text_enter_email_instruction));
        mEnterEmail.setVisibility(true ? View.VISIBLE : View.GONE);

        Button btnNext = (Button)findViewById(R.id.btnNext);
        btnNext.setText(getString(R.string.btn_next));
        btnNext.setVisibility(true ? View.VISIBLE : View.GONE);
    }

}
