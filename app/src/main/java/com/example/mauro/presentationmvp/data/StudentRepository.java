package com.example.mauro.presentationmvp.data;

import com.example.mauro.presentationmvp.data.entities.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauro on 8/24/17.
 */

public class StudentRepository {

    private static StudentRepository studentRepository;
    private List<Student> students;

    public static StudentRepository createStudentRepository() {
        if (studentRepository == null) {
            studentRepository = new StudentRepository();
        }
        return studentRepository;
    }

    private StudentRepository() {
        this.students = new ArrayList<>();
        Student s1 = new Student("Mauro", 24, 10);
        Student s2 = new Student("Anel", 28, 6);
        Student s3 = new Student("Luis", 32, 9);
        Student s4 = new Student("Andrea", 25, 8);
        Student s5 = new Student("Julio", 22, 7);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

}
