package com.theopensourcefamily.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.theopensourcefamily.mvp.R;
import com.theopensourcefamily.mvp.Views.LoginFragment;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LoginFragment.newInstance())
                    .commitNow();
        }
    }
}
