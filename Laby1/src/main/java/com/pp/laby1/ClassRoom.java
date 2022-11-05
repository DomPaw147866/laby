/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.laby1;

/**
 *
 * @author inf147866
 */
public class ClassRoom {
    
    private String name;
    
    private int capacity;

    
    public ClassRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    
    
    public String info() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void changeName(String name) {
        this.name = name;
    }
    
    
    
    
    
    
     
    
    
}
