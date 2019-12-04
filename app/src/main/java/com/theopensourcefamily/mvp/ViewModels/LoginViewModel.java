package com.theopensourcefamily.mvp.ViewModels;

import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {

    public boolean onButtonPressed(String username, String password) {
        return username.equals("u") && password.equals("p");
    }
}
