/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lessson.pkg8;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Lessson8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shiritori my_shiritori = new Shiritori();
        System.out.println("Game started. Write your word");
        while(true){
            
            Scanner in = new Scanner(System.in);
            String word = in.nextLine();
            
            try {
                my_shiritori.play(word);
            } catch (Exception ex) {
                System.out.println("1.restart \n 2.quit");
                int option = in.nextInt();
                if(option == 1){
                    my_shiritori.restart();
                }
                else{
                    Runtime.getRuntime().exit(0);
                }
            }
        }
    }
    
}
