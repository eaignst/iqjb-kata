/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.measuring;

import java.util.stream.Stream;

/**
 *
 * @author avincze
 */
public class Measuring {
    
    public static long sum1(long number){
        long result = 0L;
        for (int i = 0; i < number; i++) {
            result+=i;
        }
        return result;
    }
    
    
     public static long sum2(long number){
        return Stream.iterate(1L, i -> i + 1)
                .limit(number)
                .reduce(Long::sum).get();
    }
    
}
