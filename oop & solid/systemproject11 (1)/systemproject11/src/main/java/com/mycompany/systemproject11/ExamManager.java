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
public class ExamManager {

    private ArrayList<Exam> exams = new ArrayList<>();

    public Exam createExam(String name, String date, int duration, Course course, int type) {

        if (type == 1) {
            return new FinalExam(name, date, duration, course);
        }
        else if (type == 2) {
            return new PracticalExam(name, date, duration, course);
        }

        return null;
    }

    public void addExam(Exam exam) {
        exams.add(exam);
    }
    
    public void showExams() {
        if (exams.isEmpty()) {
            System.out.println("No exams available.");
            return;
        }
        for (Exam e : exams) {
            e.showExamInfo();
        }
    }
    
    public ArrayList<Exam> getExams() {
        return exams;
    }
}
