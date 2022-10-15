/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.projektlab;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author inf147866
 */
public class Lesson {
    
    private String name;
    
    private Topic topic;
    
    private Set<Student> students = new HashSet<>();
    
    private ClassRoom classRoom;
    
    private Teacher teacher;

    public Lesson(String name, Topic topic, Set<Student> students, ClassRoom classRoom, Teacher teacher ) {
        if(students.size()> classRoom.getCapacity() ){
            System.err.println("Sala jest za mała by pomieści taką liczbę studentów");
            return;
        }
        this.name = name;
        this.topic = topic;
        this.students = students;
        this.classRoom = classRoom;
        this.teacher = teacher;
        
        
    }

    

    public String getName() {
        return name;
    }

    public Topic getTopic() {
        return topic;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    
    
    
    
    
    
    
    
    
}
