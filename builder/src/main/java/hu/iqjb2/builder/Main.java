/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.builder;

/**
 *
 * @author avincze
 */
public class Main {
    
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .memory(new Memory("32Gb"))
                .processor(new Processor("i7"))
                .hdd(new Hdd("2Tb"))
                .display(new Display("27col"))
                .build();
        System.out.println(computer);
    }
    
}
