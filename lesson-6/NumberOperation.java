/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author student
 */
public class NumberOperation {
    
    private int numberOne; 
    private int numberTwo;
    
    
    public NumberOperation(int a, int b){
        this.numberOne = a;
        this.numberTwo = b;
    }
    
    public int max(){
        return numberOne > numberTwo ? numberOne:numberTwo;
 }
    
    public int min(){
        return numberOne < numberTwo ? numberOne:numberTwo;
 }
    public float avg(){
        return ((float)numberOne + (float)numberTwo)/2;
    }
}