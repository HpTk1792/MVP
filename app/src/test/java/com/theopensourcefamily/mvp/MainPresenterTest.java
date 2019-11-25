package com.theopensourcefamily.mvp;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

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