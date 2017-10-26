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

    private AutoCompleteTextView mEmailView;
    private TextView mEnterEmail;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);

        mEmailView = (AutoCompleteTextView)findViewById(R.id.emailAutoComplete);
        mEmailView.setError(getString(R.string.text_email));

        mEnterEmail = (TextView)findViewById(R.id.enterEmailText);
        mEnterEmail.setError(getString(R.string.text_enter_email_instruction));

        btnNext = (Button)findViewById(R.id.btnNext);
        btnNext.setError(getString(R.string.btn_next));
    }

}
