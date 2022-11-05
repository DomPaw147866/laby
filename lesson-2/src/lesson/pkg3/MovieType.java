package lesson.pkg3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author inf147866
 */
public enum MovieType {
    HORROR("Horror"),
    ACTION("Action"),
    COMEDY ("Comedy");
    
    private String name;

    private MovieType(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
     return this.name;
    }
    
}
