/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemproject11;

/**
 *
 * @author Mega Store
 */
public interface Exam {
    String getExamName();
    String getDate();
    int getDurationMinutes();
    Course getCourse();
    void showExamInfo();
}

