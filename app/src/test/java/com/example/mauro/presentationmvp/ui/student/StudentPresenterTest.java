package com.example.mauro.presentationmvp.ui.student;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Created by mauro on 8/24/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class StudentPresenterTest {

    @Mock
    StudentContract.View view;
    private StudentPresenter studentPresenter;

    @Before
    public void setUp(){
        studentPresenter = new StudentPresenter();
    }

    @Test
    public void shouldBeAbleToInstantiate(){
        assertNotNull(studentPresenter);
    }

    @Test
    public void shouldBeAbleToLoadStudent(){
        String name = "Mauro";
        studentPresenter.attachView(view);
        studentPresenter.loadStudent(name);
    }

    @Test
    public void shouldBeAbleToDetachView(){
        studentPresenter.detachView();
    }

}