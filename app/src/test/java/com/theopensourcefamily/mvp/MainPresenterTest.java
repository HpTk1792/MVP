package com.theopensourcefamily.mvp;

import com.theopensourcefamily.mvp.ui.login.MainPresenter;
import com.theopensourcefamily.mvp.ui.login.MainView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    @Mock
    MainView view;

    /*
    @After
    public void tearDown() {
        verifyNoMoreInteractions(view);
    }
*/
    @Test
    public void checkCredentialsSuccess() {
        MainPresenter presenter = new MainPresenter(view);

        presenter.onButtonPressed("username", "password");
    }

    @Test
    public void checkCredentialsError() {
        MainPresenter presenter = new MainPresenter(view);
        presenter.onButtonPressed("ps", "vs");

        verify(view, never()).doLogin();
    }
}