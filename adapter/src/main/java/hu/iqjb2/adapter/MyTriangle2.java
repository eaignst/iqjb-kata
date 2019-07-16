/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.adapter;

/**
 *
 * @author avincze
 */
public abstract class MyTriangle2 {
      private double a, b,c, m;

    public MyTriangle2(double a, double b, double c, double m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.m = m;
    }
    
    
    protected double a(){
        return a * m / 2;
    }
    
    protected double p(){
        return a + b + c;
    }
}
