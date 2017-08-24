package com.example.mauro.presentationmvp.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mauro.presentationmvp.R;
import com.example.mauro.presentationmvp.model.Student;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainContract.View {


    private static final String TAG = "MainActivityTAG_";
    @BindView(R.id.a_main_list)
    ListView listView;

    private List<Student> students;
    private ArrayAdapter<Student> studentAdapter;

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setUpView();
        mainPresenter = new MainPresenter();
        mainPresenter.attachView(this);
    }


    private void setUpView(){
        students = new ArrayList<>();
        studentAdapter = new ArrayAdapter<Student>(this, android.R.layout.simple_list_item_1, students);
        listView.setAdapter(studentAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Student student = students.get(i);
                Toast.makeText(MainActivity.this, student.toString(), Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onItemClick: " + student.toString());
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.detachView();
    }

    @Override
    public void showError(String error) {
        Log.d(TAG, "showError: " + error);
    }

    @Override
    public void showResults(List<Student> results) {
        students.clear();
        students.addAll(results);
        studentAdapter.notifyDataSetChanged();
    }

    @OnClick(R.id.a_main_btn)
    public void loadData(View view) {
        Log.d(TAG, "loadData: ");
        mainPresenter.loadResults();
    }
}
