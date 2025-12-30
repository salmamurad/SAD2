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

public class Student extends Person {

    private Department department; 
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Grade> grades = new ArrayList<>(); // درجات الطالب

    public Student(String id, String name, Department department) {
        super(id, name);
        this.department = department;
    }

    public void enrollCourse(Course c) {
        courses.add(c);
    }

    public Department getDepartment() { return department; }

    public void showMyCourses() {
        if(courses.isEmpty()) {
            System.out.println("  No courses enrolled.");
        } else {
            System.out.println("  Enrolled Courses:");
            for(Course c : courses)
                System.out.println("  - " + c.getCourseName());
        }
    }

    public void addGrade(Grade g) { grades.add(g); }

    public void showGrades() {
        if(grades.isEmpty()) {
            System.out.println("  No grades yet.");
        } else {
            System.out.println("  Grades:");
            for(Grade g : grades)
                System.out.println("  - " + g.getCourse().getCourseName() + ": " + g.getScore());
        }
    }

    @Override
    public void displayRole() {
        System.out.println(getName() + " is a Student.");
    }
}