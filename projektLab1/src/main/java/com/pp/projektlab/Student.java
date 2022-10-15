/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.projektlab;

/**
 *
 * @author inf147866
 */
public class Student {
    
    private String firstName;
    
    private String lastName;
    
    private String index;

    public Student(String firstName, String lastName, String index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
    }

    
    public String getFirstName() {
        return firstName;
    }

    
    public String getIndex() {
        return index;
    }

    public String getLastName() {
        return lastName;
    }
    
}
