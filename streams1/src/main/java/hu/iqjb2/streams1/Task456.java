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
public class Task456 extends Task implements Command{

    @Override
    public void execute() {
        System.out.println("Task456");
        IntSummaryStatistics  result = lines.collect(Collectors.summarizingInt(String::length));
        System.out.println(result);        
    }
}
