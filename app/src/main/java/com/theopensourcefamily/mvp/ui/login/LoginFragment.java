package com.theopensourcefamily.mvp.ui.login;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.theopensourcefamily.mvp.R;

public class LoginFragment extends Fragment {

    private LoginViewModel mViewModel;
    private Button loginButton;
    private EditText userEditText;
    private EditText passEditText;

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.login_fragment, container, false);
        loginButton = view.findViewById(R.id.loginButton);
        userEditText = view.findViewById(R.id.username);
        passEditText = view.findViewById(R.id.password);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        // TODO: Use the ViewModel

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mViewModel.onButtonPressed(userEditText.getText().toString()
                        , passEditText.getText().toString())){
                    getActivity().startActivity(new Intent(getActivity(), MenuView.class));
                }
                else{
                    //You are wrong
                }
            }
        });
    }

}
