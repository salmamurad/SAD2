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

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        if (s != null) {
            students.add(s);
            System.out.println("Student added: " + s.getName());
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void showStudents() {
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println(s.getId() + " - " + s.getName() + 
                               " | Dept: " + s.getDepartment().getName());
        }
    }
}

