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

public class CourseManager {

    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(Course c) {
        if (c != null) {
            courses.add(c);
            System.out.println("Course added: " + c.getCourseName());
        }
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void showCourses() {
        System.out.println("Courses:");
        for (Course c : courses) {
            c.showCourseInfo();
        }
    }
}

