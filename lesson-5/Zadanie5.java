/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author student
 */
public class Zadanie5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Euro euro = new Euro(30f);
        System.out.println(euro.abbreviation());
        euro.addedCurrency(30, "JPY");
        System.out.println(euro.abbreviation());
        euro.subtractedCurrency(4350, "JPY");
        System.out.println(euro.abbreviation());
        System.out.println(euro.toDollarExchangeRate());
        
        
    }
    
   
    
}
