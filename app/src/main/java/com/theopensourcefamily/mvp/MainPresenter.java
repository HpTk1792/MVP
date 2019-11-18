package com.theopensourcefamily.mvp;

import android.widget.EditText;

public class MainPresenter {

    private final MainView view;

    public MainPresenter(MainView view) {
        this.view = view;

        //please draw!
        view.render();
    }

    public void onButtonPressed(String username, String password) {
        if (username.equals("username") && password.equals("password")) {
            view.doLogin();
        }
    }
}
