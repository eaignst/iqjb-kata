/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.regexp;

import hu.iqjb2.regexp.tasks.Task2;
import hu.iqjb2.regexp.tasks.Task3;


/**
 *
 * @author eaignst
 */
public class Main {
    
    public static void main(String[] args) {
        CommandProcessor.INSTANCE.process(new Task2());
        CommandProcessor.INSTANCE.process(new Task2());
        CommandProcessor.INSTANCE.process(new Task3());
    }
    
}
