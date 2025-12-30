/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemproject11;




public class Grade {
    private Course course;
    private double score;

    public Grade(Course course, double score) {
        this.course = course;
        this.score = score;
    }

    public Course getCourse() { return course; }
    public double getScore() { return score; }
}