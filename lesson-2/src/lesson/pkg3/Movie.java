/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson.pkg3;

import java.util.List;

/**
 *
 * @author inf147866
 */
public class Movie {
    
    private String title;
    private Director director;
    private List<Actor> actors;
    private MovieType type;
    
    public Movie(String title, Director director, List<Actor> actors,MovieType type){
       this.title = title;
       this.director = director;
       this.actors = actors;
       this.type = type;
    
    }
    public void printInfo(){
        System.out.println(
        String.format("title: %s,\n director: %s,\n main actors: %s,\n movie type: %s ",
            title,
            director.simpleInfo(),
            String.join(",", actors.stream().map(Actor::simpleInfo).toList()),
            type.toString()));
    }
    
}
