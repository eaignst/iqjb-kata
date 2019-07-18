/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.functional;

import java.util.function.BiFunction;
import java.util.function.IntPredicate;

/**
 *
 * @author avincze
 */
public class Accumulation {
    
    private int[] a = {1,2,3,4,5,6,7,8,9,10};

    public Accumulation() {
    }
   
    public int accum(int init){
        for (int i = 0; i < a.length; i++) {
            init+=a[i];
        }
        return init;
    }
    
    public int accum(int init, Operation operation){
        for (int i = 0; i < a.length; i++) {
            init = operation.operate(init, a[i]);
        }
        return init;
    }
    
    
    public int accum(int init, Operation operation,
            Predicate predicate){
        for (int i = 0; i < a.length; i++) {
            if (predicate.test(a[i])) {
                init = operation.operate(init, a[i]);
            }
        }
        return init;
    }
    
    
    
    public int accum2(int init, 
            BiFunction<Integer, Integer, Integer> operation,
            IntPredicate predicate){
        for (int i = 0; i < a.length; i++) {
            if (predicate.test(a[i])) {
                init = operation.apply(init, a[i]);
            }
        }
        return init;
    }
    
    
    

    
}

    class MyFunction{
        public static int MYADD(int a, int b){
            return a + b;
        }
        public static boolean MYEVEN(int a){
            return a % 2 == 0;
        }
        
        public int myadd(int a, int b){
            return a + b;
        }
        
        public boolean myeven(int a){
            return a % 2 == 0;
        }
    }
