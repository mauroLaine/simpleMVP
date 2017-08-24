package com.example.mauro.presentationmvp.ui.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.mauro.presentationmvp.R;
import com.example.mauro.presentationmvp.data.entities.Student;
import com.example.mauro.presentationmvp.ui.main.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StudentActivity extends AppCompatActivity implements StudentContract.View {

    private static final String TAG = "StudentActivityTAG_";
    @BindView(R.id.a_student_name)
    TextView nameTV;
    @BindView(R.id.a_student_age)
    TextView ageTV;
    @BindView(R.id.a_student_grade)
    TextView gradeTV;

    private StudentPresenter studentPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        ButterKnife.bind(this);

        studentPresenter = new StudentPresenter();
        String name = getIntent().getStringExtra(MainActivity.STRING_NAME);

        studentPresenter.attachView(this);
        studentPresenter.loadStudent(name);
    }

    @Override
    public void showError(String error) {
        Log.d(TAG, "showError: " + error);
    }

    @Override
    public void showDetails(Student student) {
        Log.d(TAG, "showDetails: " + student.toString() + ", " + student.getAge() + ", " + student.getGrade());
        nameTV.setText(getString(R.string.student_name, student.getName()));
        ageTV.setText(getString(R.string.student_age, student.getAge()));
        gradeTV.setText(getString(R.string.student_grade, student.getGrade()));
    }
}
