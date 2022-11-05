/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.laby1;

/**
 *
 * @author inf147866
 */
public class Teacher {
    
   private String firstName;
   
   private String lastName;

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

   
   
    public String info(){
        return firstName + " "+lastName ;
    }
   
   
    
}
