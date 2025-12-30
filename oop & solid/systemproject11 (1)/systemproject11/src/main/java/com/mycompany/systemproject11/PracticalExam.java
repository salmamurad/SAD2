/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemproject11;

/**
 *
 * @author Mega Store
 */
public class PracticalExam implements Exam {

    private String examName;
    private String date;
    private int durationMinutes;
    private Course course;

    public PracticalExam(String examName, String date, int durationMinutes, Course course) {
        this.examName = examName;
        this.date = date;
        this.durationMinutes = durationMinutes;
        this.course = course;
    }

    @Override
    public String getExamName() { return examName; }

    @Override
    public String getDate() { return date; }

    @Override
    public int getDurationMinutes() { return durationMinutes; }

    @Override
    public Course getCourse() { return course; }

    @Override
    public void showExamInfo() {
        System.out.println("Practical Exam: " + examName +
                " | Course: " + course.getCourseName() +
                " | Date: " + date +
                " | Duration: " + durationMinutes + " min" +
                " | Type: Practical");
    }
}
