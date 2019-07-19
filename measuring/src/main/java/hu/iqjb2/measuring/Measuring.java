/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.measuring;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 *
 * @author avincze
 */
public class Measuring {
    
    public static long sum1(long number){
        long result = 0L;
        for (int i = 1; i <= number; i++) {
            result+=i;
        }
        return result;
    }
    
    
    public static long sum2(long number){
        return Stream.iterate(1L, i -> i + 1)
                .limit(number)
                .reduce(Long::sum).get();
    }
    
    public static long sum2b(long number){
        return Stream.iterate(1L, i -> i + 1)
                .limit(number)
                .parallel()
                .reduce(Long::sum).get();
    }
    
    public static long sum3(long number){
        MySum mySum = new MySum();
        LongStream.rangeClosed(1L, number)
                .forEach(mySum::add);
        return mySum.sum;
    }
    
    public static long sum3b(long number){
        MySum mySum = new MySum();
        LongStream.rangeClosed(1L, number).parallel()
                .forEach(mySum::add);
        return mySum.sum;
    }
}

class MySum{
    long sum = 0L;
    public synchronized void add(long l){
        sum+=l;
    }
}
