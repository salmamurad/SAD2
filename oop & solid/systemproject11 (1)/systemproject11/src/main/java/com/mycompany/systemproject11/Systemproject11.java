/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.systemproject11;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import java.util.ArrayList;
import java.util.Scanner;



public class Systemproject11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Admin admin = new Admin("A001", "Aliaa Admin");

        boolean running = true;

        while(running) {
            System.out.println("\n===== SMART UNIVERSITY SYSTEM =====");
            System.out.println("1. Admin Actions");
            System.out.println("2. Departments");
            System.out.println("3. Students");
            System.out.println("4. Teachers");
            System.out.println("5. Courses");
            System.out.println("6. Exams");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
    case 1:
    boolean adminMenu = true;

    while(adminMenu) {
        System.out.println("\n--- Admin Menu ---");
        System.out.println("1. Add Department");
        System.out.println("2. Add Teacher");
        System.out.println("3. Add Course");
        System.out.println("4. Add Student");
        System.out.println("5. Create Exam");
        System.out.println("0. Back");
        System.out.print("Choose: ");

        int adminChoice = sc.nextInt();
        sc.nextLine();

        switch(adminChoice) {

            case 1:
                System.out.print("Enter department name: ");
                String dName = sc.nextLine();
                Department d = new Department(dName);
                admin.getDepartmentManager().addDepartment(d);
                System.out.println("Department added.");
                break;

            case 2:
                System.out.print("Enter teacher name: ");
                String tName = sc.nextLine();
                int nextId = admin.getTeacherManager().getTeachers().size() + 1;
                Teacher t = new Teacher("T" + nextId, tName);
                admin.getTeacherManager().addTeacher(t);
                System.out.println("Teacher added.");
                break;

            case 3:
                ArrayList<Teacher> teacherList = admin.getTeacherManager().getTeachers();
                if (teacherList.isEmpty()) {
                    System.out.println("No teachers available!");
                    break;
                }

                System.out.print("Course name: ");
                String cName = sc.nextLine();

                System.out.println("Choose teacher:");
                for (int i = 0; i < teacherList.size(); i++) {
                    System.out.println((i + 1) + ". " + teacherList.get(i).getName());
                }

                int tIndex = sc.nextInt() - 1;
                sc.nextLine();

                System.out.println("Select course type:");
                System.out.println("1. Theory Course");
                System.out.println("2. Practical Course");
                System.out.print("Choose: ");
                int courseType = sc.nextInt();
                sc.nextLine();

                Course newCourse;
                if (courseType == 1)
                    newCourse = new TheoryCourse(cName, teacherList.get(tIndex));
                else if (courseType == 2)
                    newCourse = new PracticalCourse(cName, teacherList.get(tIndex));
                else {
                    System.out.println("Invalid type!");
                    break;
                }

                admin.getCourseManager().addCourse(newCourse);
                teacherList.get(tIndex).addCourse(newCourse);
                System.out.println("Course added successfully!");
                break;

            case 4:
                ArrayList<Department> deps = admin.getDepartmentManager().getDepartments();
                if (deps.isEmpty()) {
                    System.out.println("No departments available!");
                    break;
                }

                System.out.print("Student name: ");
                String sName = sc.nextLine();

                System.out.println("Choose department:");
                for (int i = 0; i < deps.size(); i++) {
                    System.out.println((i + 1) + ". " + deps.get(i).getName());
                }

                int depIndex = sc.nextInt() - 1;

                Student s = new Student(
                        "S" + (admin.getStudentManager().getStudents().size() + 1),
                        sName,
                        deps.get(depIndex)
                );

                admin.getStudentManager().addStudent(s);
                deps.get(depIndex).addStudent(s);
                System.out.println("Student added.");
                break;

            case 5:
                ArrayList<Course> courses = admin.getCourseManager().getCourses();
                if (courses.isEmpty()) {
                    System.out.println("No courses available to attach exam.");
                    break;
                }

                System.out.print("Exam name: ");
                String eName = sc.nextLine();
                System.out.print("Date: ");
                String date = sc.nextLine();
                System.out.print("Duration: ");
                int dur = sc.nextInt();
                sc.nextLine();

                System.out.println("Choose course:");
                for (int i = 0; i < courses.size(); i++) {
                    System.out.println((i + 1) + ". " + courses.get(i).getCourseName());
                }

                int cIndex = sc.nextInt() - 1;
                sc.nextLine();

                System.out.println("Select Exam Type:");
                System.out.println("1. Final Exam");
                System.out.println("2. Practical Exam");
                System.out.print("Choose: ");
                int examType = sc.nextInt();
                sc.nextLine();

                Exam createdExam = admin.getExamManager()
                        .createExam(eName, date, dur, courses.get(cIndex), examType);

                if (createdExam != null) {
                    admin.getExamManager().addExam(createdExam);
                    System.out.println("Exam created successfully!");
                }
                break;

            case 0:
                adminMenu = false;
                break;

            default:
                System.out.println("Invalid option!");
        }
    }
    break;
                case 2:
                    admin.getDepartmentManager().showDepartments();
                    break;
                    
                    case 3:
    ArrayList<Student> studentsList = admin.getStudentManager().getStudents();

    if(studentsList.isEmpty()) {
        System.out.println("No students available.");
        break;
    }

    System.out.println("--- Choose Student ---");
    for(int i = 0; i < studentsList.size(); i++) {
        System.out.println((i+1) + ". " + studentsList.get(i).getName());
    }

    int sIndex = sc.nextInt() - 1;
    sc.nextLine();

    Student selectedStudent = studentsList.get(sIndex);

    boolean studentMenu = true;
    while(studentMenu) {
        System.out.println("\n--- Student Menu (" + selectedStudent.getName() + ") ---");
        System.out.println("1. View My Courses");
        System.out.println("2. View My Grades");
        System.out.println("0. Back");
        System.out.print("Choose: ");

        int sChoice = sc.nextInt();
        sc.nextLine();

        switch(sChoice) {
            case 1:
                selectedStudent.showMyCourses();
                break;
            case 2:
                selectedStudent.showGrades();
                break;
            case 0:
                studentMenu = false;
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    break;
    
                case 4:
    ArrayList<Teacher> teachersList = admin.getTeacherManager().getTeachers();

    if(teachersList.isEmpty()) {
        System.out.println("No teachers available.");
        break;
    }

    System.out.println("--- Choose Teacher ---");
    for(int i = 0; i < teachersList.size(); i++) {
        System.out.println((i+1) + ". " + teachersList.get(i).getName());
    }

    int tIndex = sc.nextInt() - 1;
    sc.nextLine();

    Teacher selectedTeacher = teachersList.get(tIndex);

    boolean teacherMenu = true;
    while(teacherMenu) {
        System.out.println("\n--- Teacher Menu (" + selectedTeacher.getName() + ") ---");
        System.out.println("1. View My Courses");
        System.out.println("2. Assign Grade");
        System.out.println("0. Back");
        System.out.print("Choose: ");

        int tChoice = sc.nextInt();
        sc.nextLine();

        switch(tChoice) {
            case 1:
                ArrayList<Course> teacherCourses = selectedTeacher.getTeachingCourses();
                if(teacherCourses.isEmpty()) {
                    System.out.println("No courses assigned.");
                } else {
                    for(Course c : teacherCourses)
                        System.out.println("- " + c.getCourseName());
                }
                break;

            case 2:
                ArrayList<Student> allStudents = admin.getStudentManager().getStudents();
                ArrayList<Course> courses = selectedTeacher.getTeachingCourses();

                if(allStudents.isEmpty() || courses.isEmpty()) {
                    System.out.println("Students or courses not available.");
                    break;
                }

                System.out.println("Choose student:");
                for(int i = 0; i < allStudents.size(); i++) {
                    System.out.println((i+1) + ". " + allStudents.get(i).getName());
                }

                int stIndex = sc.nextInt() - 1;
                sc.nextLine();

                System.out.println("Choose course:");
                for(int i = 0; i < courses.size(); i++) {
                    System.out.println((i+1) + ". " + courses.get(i).getCourseName());
                }

                int coIndex = sc.nextInt() - 1;
                sc.nextLine();

                System.out.print("Enter grade: ");
                double grade = sc.nextDouble();
                sc.nextLine();

                selectedTeacher.assignGrade(
                        allStudents.get(stIndex),
                        courses.get(coIndex),
                        grade
                );

                System.out.println("Grade assigned successfully!");
                break;

            case 0:
                teacherMenu = false;
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
    break;
             
                case 5:
                    admin.getCourseManager().showCourses();
                    break;
                case 6:
                    admin.getExamManager().showExams();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}