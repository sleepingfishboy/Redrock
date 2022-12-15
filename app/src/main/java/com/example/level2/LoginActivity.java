package com.example.level2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private ImageView mImgHead;
    private EditText mEtUsername;
    private EditText mEtPassword;
    private Button mBtnLogin;
    private TextView mTvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        mImgHead = findViewById(R.id.img_main_head);
        mEtPassword = findViewById(R.id.et_main_password);
        mEtUsername = findViewById(R.id.et_main_username);
        mBtnLogin = findViewById(R.id.btn_main_login);
        mTvRegister = findViewById(R.id.tv_main_register);
        SharedPreferences sp = getSharedPreferences("check", Context.MODE_PRIVATE);
        SharedPreferences.Editor eit = sp.edit();
        {

            mTvRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view1) {

                    View view = getLayoutInflater().inflate(R.layout.sign_in, null);

                    final EditText et_register_username = (EditText) view.findViewById(R.id.et_register_username);
                    final EditText et_register_password = (EditText) view.findViewById(R.id.et_register_password);
                    AlertDialog dialog = new AlertDialog.Builder(LoginActivity.this).setTitle("注册")//设置对话框的标题
                            .setView(view).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                    String name = et_register_username.getText().toString().trim();
                                    String password = et_register_password.getText().toString().trim();
                                    eit.putString("account", name);
                                    eit.putString("password", password);
                                    eit.apply();
                                    Toast.makeText(LoginActivity.this, "注册成功", Toast.LENGTH_SHORT).show();


                                }
                            }).create();
                    dialog.show();


                }
            });
        }
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });


    }


    private void login() {
        String account = mEtUsername.getText().toString();
        String password = mEtPassword.getText().toString();
        String account1 = getSharedPreferences("check", Context.MODE_PRIVATE).getString("account", null);
        String password1 = getSharedPreferences("check", Context.MODE_PRIVATE).getString("password", null);

        if (!password.equals("") && !account.equals("")) {

            try {    //使用try-catch语句进行异常捕获
                Object object = null;
                object.toString();
            } catch (NullPointerException e) {

            }
            if (account1.equals(account) && password1.equals(password)) {

                Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(LoginActivity.this, ThreeGStoryActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(LoginActivity.this, "登录失败", Toast.LENGTH_LONG).show();
            }
        }
    }
}

//

