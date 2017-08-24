package com.example.mauro.presentationmvp.ui.main;

import com.example.mauro.presentationmvp.data.entities.Student;
import com.example.mauro.presentationmvp.data.StudentRepository;

import java.util.List;

/**
 * Created by mauro on 8/24/17.
 */

public class MainPresenter implements MainContract.Presenter {

    private static final String TAG = "MainPresenterTAG_";
    private MainContract.View view;
    private StudentRepository studentRepository;
    private List<Student> students;

    public MainPresenter() {
        this.studentRepository = StudentRepository.createStudentRepository();
    }

    @Override
    public void attachView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void loadResults() {
        try {
            students = studentRepository.getStudents();
            view.showResults(students);
        } catch (Exception e) {
            view.showError(e.toString());
        }
    }
}
