/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package lesson.pkg2;

/**
 *
 * @author inf147866
 */
public enum Category {
    
    HORROR("horror"),
    COMEDY("comedy"),
    DRAMAT("dramat"),
    EDUCATION("education");
    
    String name;

    private Category(String name) {
        this.name = name;
    }
   
    @Override
    public String toString(){
        return this.name; 
    
    }
    
}
