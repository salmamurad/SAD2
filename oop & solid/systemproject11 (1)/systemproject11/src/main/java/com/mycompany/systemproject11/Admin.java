/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemproject11;

/**
 *
 * @author Mega Store
 */
public class Admin extends Person {

    private DepartmentManager departmentManager;
    private TeacherManager teacherManager;
    private ExamManager examManager;
    private CourseManager courseManager;  
    private StudentManager studentManager;
    public Admin(String id, String name) {
        super(id, name);
        this.departmentManager = new DepartmentManager();
        this.teacherManager = new TeacherManager();
        this.examManager = new ExamManager();
         this.courseManager = new CourseManager();     
        this.studentManager = new StudentManager();
    }

    public DepartmentManager getDepartmentManager() {
        return departmentManager;
    }

    public TeacherManager getTeacherManager() {
        return teacherManager;
    }

    public ExamManager getExamManager() {
        return examManager;
    }
    
    public CourseManager getCourseManager() { 
          return courseManager; 
      }  
    
    public StudentManager getStudentManager() { 
        return studentManager;
    } 
    
    @Override
    public void displayRole() {
        System.out.println(getName() + " is an Admin.");
    }

}

