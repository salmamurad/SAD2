/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemproject11;

/**
 *
 * @author Mega Store
 */


import java.util.ArrayList;

public class Teacher extends Person {

    private final ArrayList<Course> teachingCourses = new ArrayList<>();

    public Teacher(String id, String name) {
        super(id, name);
    }

    public void addCourse(Course c) { teachingCourses.add(c); }

    public ArrayList<Course> getTeachingCourses() { return teachingCourses; }

    public void assignGrade(Student s, Course c, double score) {
        Grade g = new Grade(c, score);
        s.addGrade(g);
    }

    @Override
    public void displayRole() {
        System.out.println(getName() + " is a Teacher.");
    }
}