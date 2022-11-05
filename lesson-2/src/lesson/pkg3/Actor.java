/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson.pkg3;

/**
 *
 * @author inf147866
 */
public class Actor {
    private String name;
    private int age;
    
    
    public Actor(String name, int age){
        this.name = name;
        this.age = age;
        
    }
    
    public String simpleInfo(){
        return String.format("%s(age:%d)", name,age);
    }
}
