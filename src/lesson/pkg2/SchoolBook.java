/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson.pkg2;

/**
 *
 * @author inf147866
 */
public class SchoolBook implements BookInterface {

    private String title;
    
    private Category category;
    
    private int numberOfPage;
    
    private boolean isCopy;

    public SchoolBook(String title, int numberOfPage) {
        this.title = title;
        this.category = Category.EDUCATION;
        this.numberOfPage = numberOfPage;
        this.isCopy = false;
    }
    
    
    public SchoolBook(String title,int numberOfPage, boolean isCopy){
        this(title,numberOfPage);
        this.isCopy = isCopy;
    }
    @Override
    public void read() {
        System.out.println("I'm reading School Book.");
    }

    @Override
    public void simpleInfo() {
        System.out.println(
                String.format("Shool Book title: %s ,\n page number: %s, \n category: %s ,\n  is copy:%s \n",
        title, numberOfPage, category.toString(), isCopy));
    }

    @Override
    public BookInterface copy() {
        return new SchoolBook(title, numberOfPage, true);
    }
    

    
    
}
