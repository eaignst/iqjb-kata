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
public class Task8 extends Task implements Command{

    private int groupSize;
    
    public Task8(int groupSize) {
        this.groupSize = groupSize;
    }

    
    @Override
    public void execute() {
        System.out.println("Task8");
       
        lines.collect(Collectors.groupingBy(w->order(w)))
                .values().stream().filter(l->l.size() == groupSize)
                .map(List::toString)
                .forEach(System.out::println);
        
    }
    
    private String order(String s){
        return s.chars().sorted().mapToObj(String::valueOf).collect(Collectors.joining());
    }
}
