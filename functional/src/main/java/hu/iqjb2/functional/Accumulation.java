/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.functional;

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
}
