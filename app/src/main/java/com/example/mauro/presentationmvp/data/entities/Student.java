package com.example.mauro.presentationmvp.data.entities;

/**
 * Created by mauro on 8/24/17.
 */


public class Student {

    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        setAge(age);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age < 18 ? 18 : age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade > 0 ? grade > 10 ? 10 : grade : 0;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }

}
