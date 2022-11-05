/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson.pkg2;

/**
 *
 * @author inf147866
 */
public class Lesson2 {

  
    public static void main(String[] args) {
        
        SchoolBook schoolBook = new SchoolBook("English for primary Shool", 50);
        schoolBook.read();
        schoolBook.simpleInfo();
        
        SchoolBook copyOfSchoolBook = (SchoolBook) schoolBook.copy();
        copyOfSchoolBook.simpleInfo();
        
        
        HorrorBook horrorBook = new HorrorBook("Scary Book", 50);
        horrorBook.read();
        horrorBook.simpleInfo();
        
        HorrorBook copyOfHorrorBook = (HorrorBook) horrorBook.copy();
        copyOfHorrorBook.simpleInfo();
    }
    
}
