/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.laby2;

/**
 *
 * @author inf147866
 */
public class Computer implements Runnable{
    
    private String name;
    
    private String processor;
    
    private String gpu;
    
    private String ram;
    
    private String disc;

    public Computer(String name, String processor, String ram, String disc) {
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.disc = disc;
    }

    public Computer(String name, String processor, String gpu, String ram, String disc) {
       this(name, processor, ram, disc);
       this.gpu= gpu;
       
    }

    @Override
    public void run() {
        System.out.println(String.format("Uruchamiam Komputer %s", name));
    }

    @Override
    public void writeSpecificationGPU() {
        if(gpu== null){
             System.out.println("Ten komputer nie ma Karty graficznej");
        }
        else{
            System.out.println(String.format("Nazwa karty graficzej tego komputera to: %s", gpu));
        }
        
    }
}
