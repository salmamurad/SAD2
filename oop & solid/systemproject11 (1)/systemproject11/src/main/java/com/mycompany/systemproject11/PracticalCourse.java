/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemproject11;

/**
 *
 * @author Mega Store
 */
public class PracticalCourse implements Course {

    private String courseName;
    private Teacher teacher;

    public PracticalCourse(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public void showCourseInfo() {
        System.out.println("Practical Course: " + courseName +
                           " | Teacher: " + teacher.getName());
    }
}


