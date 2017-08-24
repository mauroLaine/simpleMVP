package com.example.mauro.presentationmvp.ui.student;

import android.util.Log;

import com.example.mauro.presentationmvp.model.Student;
import com.example.mauro.presentationmvp.model.StudentRepository;
import com.example.mauro.presentationmvp.ui.main.MainContract;

/**
 * Created by mauro on 8/24/17.
 */

public class StudentPresenter implements StudentContract.Presenter {

    private static final String TAG = "StudentPresenterTAG_";
    private StudentContract.View view;
    private StudentRepository studentRepository;

    public StudentPresenter() {
        this.studentRepository = StudentRepository.createStudentRepository();
    }

    @Override
    public void attachView(StudentContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void loadStudent(String name) {

        try {
            Student student = studentRepository.getStudent(name);
            view.showDetails(student);
        } catch (Exception e) {
            view.showError(e.toString());
        }
    }
}
