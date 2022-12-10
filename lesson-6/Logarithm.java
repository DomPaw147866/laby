/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author student
 */
public class Logarithm implements Number {

    private double base, argument;

    @Override
    public double doubleValue() throws Exception{
        if(this.base < 0){
            
            throw new Exception("base must higher that 0.");
        }
        
        if(this.base == 1){
             throw new Exception("base must different from 1.");
        }
        
        if(this.argument < 0){
             throw new Exception("argument must higher that 0.");
        }
        
        return Math.log(this.argument) / Math.log(this.base);
    }

    public Logarithm(double inputBase, double inputArgument) {
        this.base = inputBase;
        this.argument = inputArgument;
    }
}
