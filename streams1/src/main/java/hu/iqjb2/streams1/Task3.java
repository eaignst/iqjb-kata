/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.streams1;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author avincze
 */
public class Task3 extends Task implements Command{

    @Override
    public void execute() {
        System.out.println("Task3");
        int numberOfCharacters  = lines.mapToInt(String::length).sum();
        System.out.println(numberOfCharacters);        
    }
}
