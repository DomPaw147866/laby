/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.pp.projektlab;

/**
 *
 * @author inf147866
 */
public enum Topic {
 
    IT("information technology"),
    LANG("language"),;
    
    private String fullName;
    
    private Topic(String fullName) { 
        this.fullName = fullName ;
    }
public String getName(){
        return fullName;
    }
    
}
