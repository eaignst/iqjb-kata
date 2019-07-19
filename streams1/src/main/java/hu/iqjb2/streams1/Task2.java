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
public class Task2 extends Task implements Command{

    @Override
    public void execute() {
        System.out.println("Task2");
        lines.map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .forEach((key, value)->System.out.println(key + ": " + value));
    }
}
