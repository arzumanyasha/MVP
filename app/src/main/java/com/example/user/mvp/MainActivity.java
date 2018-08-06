package com.example.user.mvp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText etUserName, etPassword;
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserName = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        tvLogin    = (TextView) findViewById(R.id.tvLogin);

        tvLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String userName = etUserName.getText().toString();
        String password = etPassword.getText().toString();
    }
}
