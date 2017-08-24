package com.example.mauro.presentationmvp.ui.main;

import com.example.mauro.presentationmvp.data.StudentRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mauro on 8/24/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    @Mock
    MainContract.View view;
    private MainPresenter mainPresenter;

    @Before
    public void setUp(){
        mainPresenter = new MainPresenter();
    }

    @Test
    public void shouldBeAbleToInstantiatePresenter(){
        assertNotNull(mainPresenter);
    }

    @Test
    public void shouldBeAbleToLoadResults(){
        mainPresenter.attachView(view);
        mainPresenter.loadResults();
    }

    @Test
    public void shouldBeAbleToDetachView(){
        mainPresenter.detachView();
    }

}