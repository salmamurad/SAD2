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

public class DepartmentManager {

    private ArrayList<Department> departments = new ArrayList<>();

    public void addDepartment(Department d) {
        if (d != null) {
            departments.add(d);
            System.out.println("Department added: " + d.getName());
        }
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void showDepartments() {
        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("- " + d.getName());
        }
    }
}

