/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.measuring;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 *
 * @author avincze
 */
public class Main {
        
    public static void main(String[] args) {
        System.out.println("sum1: " + measure(Measuring::sum1, 30_000_000L) + " ms");
        System.out.println("sum2: " + measure(Measuring::sum2, 30_000_000L) + " ms");
    }
        
    
    public static <T,R> long measure(Function<T,R> function, T arg){
        List<Long> executionTimes = new ArrayList<>();
        IntStream.rangeClosed(0, 10).forEach(
               i->  {
                        long startTime = System.currentTimeMillis();
                        R ret = function.apply(arg);
                        System.out.println(ret);
                        long endTime = System.currentTimeMillis();
                        executionTimes.add(endTime-startTime);
                    }
        );
        return executionTimes.stream().mapToLong(l->l).min().getAsLong();
    }
    
}
