/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson.pkg2;

import java.util.List;

/**
 *
 * @author inf147866
 */
public class HorrorBook implements BookInterface {
    
    private String title;
    
    private Category category;
    
    private int numberOfPage;
    
    private boolean isCopy;

    public HorrorBook(String title, int numberOfPage) {
        this.title = title;
        this.category = Category.HORROR;
        this.numberOfPage = numberOfPage;
        this.isCopy = false;
    }

    
    private HorrorBook(String title, int numberOfPage , boolean isCopy) {
        this(title,numberOfPage);
        this.isCopy = isCopy;
    }
    
    @Override
    public void read() {
        System.out.println("I'm  reading  horror Book.");
    }

    @Override
    public void simpleInfo() {
        System.out.println(
                String.format("Horror Book title: %s ,\n page number: %s, \n category: %s,\n is copy:%s \n",
        title, numberOfPage, category.toString(),isCopy));
    }

    @Override
    public BookInterface copy() {
        return new HorrorBook(title, numberOfPage, true);
    }
    
}
