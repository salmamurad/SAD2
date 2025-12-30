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

public class Department {

    private String name; 
    private ArrayList<Student> students; 

    public Department(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // إضافة طالب للقسم
    public void addStudent(Student s) {
        if (s != null) {
            students.add(s);
            System.out.println("Student " + s.getName() + " added to " + name + " department.");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void showDepartmentInfo() {
        System.out.println("Department: " + name);
        System.out.println("Students in this department:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

