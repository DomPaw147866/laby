/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson.pkg3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author inf147866
 */
public class Lesson3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Director movieDirector = new Director("Andzej Wrona", 49);
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Piotr Radios", 32));
        actors.add(new Actor("Helena Wamos",28));
        
        Movie greatComedy = new Movie("Very good comedy", movieDirector, actors, MovieType.COMEDY);
        
        greatComedy.printInfo();

    }
    
}
