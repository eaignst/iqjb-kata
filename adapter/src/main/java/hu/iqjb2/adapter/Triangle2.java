/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.adapter;

import sun.java2d.pipe.SpanIterator;

/**
 *
 * @author avincze
 */
public class Triangle2 extends MyTriangle2 implements Shape{

    private double a, b, c, m;

    public Triangle2(double a, double b, double c, double m) {
        super(a, b, c, m);
        this.a = a;
        this.b = b;
        this.c = c;
        this.m = m;
    }
    
    
    @Override
    public double area() {
        return super.a();
    }

    @Override
    public double perim() {
        return super.p();
    }
    
}
