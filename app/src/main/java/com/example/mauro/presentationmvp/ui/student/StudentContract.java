package com.example.mauro.presentationmvp.ui.student;

import com.example.mauro.presentationmvp.BasePresenter;
import com.example.mauro.presentationmvp.BaseView;
import com.example.mauro.presentationmvp.model.Student;
import com.example.mauro.presentationmvp.ui.main.MainContract;

import java.util.List;

/**
 * Created by mauro on 8/24/17.
 */

public interface StudentContract {

    interface View extends BaseView {
        void showDetails(Student student);
    }

    interface Presenter extends BasePresenter<StudentContract.View> {
        void loadStudent(String name);
    }


}
