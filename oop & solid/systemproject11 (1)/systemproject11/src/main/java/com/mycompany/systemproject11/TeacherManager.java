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

public class TeacherManager {

    private ArrayList<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher t) {
        if (t != null) {
            teachers.add(t);
            System.out.println("Teacher added: " + t.getName());
        }
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void showTeachers() {
        System.out.println("Teachers:");
        for (Teacher t : teachers) {
            System.out.println("- " + t.getName());
        }
    }
}
