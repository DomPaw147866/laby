/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.pp.laby2;

/**
 *
 * @author inf147866
 */
public class Laby2 {

    public static void main(String[] args) {
        Computer computerWithoutGPU = 
                new Computer("Komputer biurowy", "intel i3", "goodram 16gb", "goodram 1TB SSD");
        Computer computerWithGPU = 
                new Computer("Komputer Osobisty", "intel i7", "RTX 3070TI NVIDIA", "goodram 32gb","goodram 1TB SSD");
        computerWithGPU.writeSpecificationGPU();
        computerWithoutGPU.writeSpecificationGPU();
    }
}
