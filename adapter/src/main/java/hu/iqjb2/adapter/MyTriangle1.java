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
public class MyTriangle1 {
    
    private double a, b,c, m;

    public MyTriangle1(double a, double b, double c, double m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.m = m;
    }
    
    
    public double a(){
        return a * m / 2;
    }
    
    public double p(){
        return a + b + c;
    }
}
