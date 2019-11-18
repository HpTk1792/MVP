package com.theopensourcefamily.mvp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MainView{

    private MainPresenter presenter;
    private Button loginButton;
    private EditText username;
    private EditText password;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);

        loginButton = findViewById(R.id.loginButton);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onButtonPressed(username.getText().toString(), password.getText().toString());
            }
        });
    }

    @Override
    public void render() {
        //I draw things :)
    }

    @Override
    public void changeBackgroundToBlack() {

    }

    @Override
    public void fillName(String name) {
        username.setText(name);
    }

    @Override
    public void doLogin (){
        //Change view
    }
}
