/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemproject11;

/**
 *
 * @author Mega Store
 */
public abstract class Person {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Encapsulation Getters/Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    
    public abstract void displayRole();
}

