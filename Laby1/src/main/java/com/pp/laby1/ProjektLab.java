package com.pp.laby1;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author inf147866
 */
public class ProjektLab {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ClassRoom classRoom = new ClassRoom("Sala Labolatoryjna 2.3", 10);
        Teacher teacher = new Teacher("Jan", "Kowalski");
        Set<Student> students = new HashSet<>();
        Student student = new Student("Piotr", "Nowak", "123876");
        Student student1 = new Student("Ula", "Trawa", "353876");
        Student student2 = new Student("Tomasz", "Kowalski", "523876");
        students.add(student);
        students.add(student1);
        students.add(student2);
        Lesson englishLesson = new Lesson("zajecia j.angielskiego", Topic.LANG, students, classRoom, teacher);
         englishLesson.info();
        
                
        
    }
}
