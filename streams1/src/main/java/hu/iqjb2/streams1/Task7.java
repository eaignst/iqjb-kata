/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.streams1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

/**
 *
 * @author avincze
 */
public class Task7 extends Task implements Command{

    private String word;
    
    public Task7(String word) {
        this.word = word;
    }

    
    @Override
    public void execute() {
        System.out.println("Task7");
        String ordered = order(word);
        String result = lines.filter(w->ordered.equals(order(w)))
                .collect(Collectors.joining(", "));
        System.out.println(result);        
    }
    
    private String order(String s){
        return s.chars().sorted().mapToObj(String::valueOf)
                .collect(Collectors.joining());
    }
}
