package com.example.user.mvp.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.mvp.R;
import com.example.user.mvp.model.PresenterImpl;
import com.example.user.mvp.presenter.LoginPresenter;
import com.example.user.mvp.view.LoginView;

public class MainActivity extends Activity implements View.OnClickListener, LoginView {

    EditText etUserName, etPassword;
    TextView tvLogin;

    LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserName = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        tvLogin    = (TextView) findViewById(R.id.tvLogin);

        tvLogin.setOnClickListener(this);

        mLoginPresenter = new PresenterImpl(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        String userName = etUserName.getText().toString();
        String password = etPassword.getText().toString();

        mLoginPresenter.performLogin(userName, password);
    }

    @Override
    public void loginValidations() {
        Toast.makeText(getApplicationContext(), "Please enter credentials", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(getApplicationContext(), "Login success", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(getApplicationContext(), "Login failure", Toast.LENGTH_LONG).show();
    }
}
