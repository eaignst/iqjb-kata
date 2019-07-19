/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.streams1;

/**
 *
 * @author avincze
 */
public class Main2 {
    
    public static void main(String[] args) {
        CommandProcessor.INSTANCE.process(new Task1());
        CommandProcessor.INSTANCE.process(new Task2());
        CommandProcessor.INSTANCE.process(new Task3());
        CommandProcessor.INSTANCE.process(new Task456());
        CommandProcessor.INSTANCE.process(new Task7("secure"));
        CommandProcessor.INSTANCE.process(new Task8(4));
        CommandProcessor.INSTANCE.process(new Task9());
        CommandProcessor.INSTANCE.process(new Task10());
    }
    
}
