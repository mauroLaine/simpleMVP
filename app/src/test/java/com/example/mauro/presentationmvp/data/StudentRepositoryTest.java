package com.example.mauro.presentationmvp.data;

import com.example.mauro.presentationmvp.data.entities.Student;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mauro on 8/24/17.
 */


public class StudentRepositoryTest {

    private StudentRepository studentRepository;

    @Before
    public void setUp() {
        studentRepository = StudentRepository.createStudentRepository();
    }

    @Test
    public void init_shouldBeAbleToInstantiate() {
        assertNotNull(studentRepository);
    }

    @Test
    public void getStudent_shouldBeVlid(){
        String name = "Mauro";
        Student student = studentRepository.getStudent(name);
        assertEquals(10, student.getGrade());
    }

    @Test
    public void getStudents_shouldBeAbleToInstantiate(){
        List<Student> students = studentRepository.getStudents();
        assertNotNull(students);
    }
}