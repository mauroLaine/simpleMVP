package com.example.mauro.presentationmvp.data.entities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mauro on 8/24/17.
 */
public class StudentTest {

    private Student student;

    @Test
    public void init_shouldBeAbleToInstantiate(){
        student = new Student("Mauro", 24, 9);
        assertNotNull(student);
    }

    @Test
    public void getAge_shoudBeValid(){
        student = new Student("Juan", 12, 10);
        assertEquals(18, student.getAge());
        student.setAge(30);
        assertEquals(30, student.getAge());
    }

    @Test
    public void getGrade_shoudBeValid(){
        student = new Student("Andrea", 22, -10);
        assertEquals(0, student.getGrade());
        student.setGrade(70);
        assertEquals(10, student.getGrade());
    }

}