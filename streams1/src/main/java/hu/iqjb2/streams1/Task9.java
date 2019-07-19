/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.streams1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author avincze
 */
public class Task9 extends Task implements Command{

    
    
    @Override
    public void execute() {
        System.out.println("Task9");
       
        lines.collect(Collectors.groupingBy(s->order(s), Collectors.counting()))
                .values().stream()
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .forEach((key, value)->System.out.println(key + ": " + value));
    }
    
    private String order(String s){
        return s.chars().sorted().mapToObj(String::valueOf).collect(Collectors.joining());
    }
}
