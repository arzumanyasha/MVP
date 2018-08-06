package com.example.user.mvp.model;

import android.text.TextUtils;

import com.example.user.mvp.presenter.LoginPresenter;
import com.example.user.mvp.view.LoginView;

/**
 * Created by User on 06.08.2018.
 */

public class PresenterImpl implements LoginPresenter{

    LoginView mLoginView;

    public PresenterImpl(LoginView loginView){
        this.mLoginView = loginView;
    }

    @Override
    public void performLogin(String userName, String password) {
        if(TextUtils.isEmpty(userName) || TextUtils.isEmpty(password)){
            mLoginView.loginValidations();
        }
        else {
            if(userName.equals("Arturka") && password.equals("Vadeich")){
                mLoginView.loginSuccess();
            }
            else mLoginView.loginError();
        }
    }
}
