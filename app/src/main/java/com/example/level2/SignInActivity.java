package com.example.level2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {

    private EditText mEtUsername;
    private EditText mEtPassword;
    public Button mBtnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        mEtPassword = findViewById(R.id.et_register_password);
        mEtUsername = findViewById(R.id.et_register_username);

    }
}