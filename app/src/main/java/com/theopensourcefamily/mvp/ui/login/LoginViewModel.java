package com.theopensourcefamily.mvp.ui.login;

import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {

    public boolean onButtonPressed(String username, String password) {
        return username.equals("username") && password.equals("password");
    }
}
