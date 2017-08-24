package com.example.mauro.presentationmvp.ui.main;

import com.example.mauro.presentationmvp.BasePresenter;
import com.example.mauro.presentationmvp.BaseView;
import com.example.mauro.presentationmvp.data.entities.Student;

import java.util.List;

/**
 * Created by mauro on 8/24/17.
 */

public interface MainContract {

    interface View extends BaseView {
        void showResults(List<Student> results);
    }

    interface Presenter extends BasePresenter<View> {
        void loadResults();
    }

}
