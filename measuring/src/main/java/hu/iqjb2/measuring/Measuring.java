/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.measuring;

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
    
}
