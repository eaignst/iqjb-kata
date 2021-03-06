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
public class Triangle1 implements Shape{

    private MyTriangle1 adaptee;
    private double a, b, c, m;

    public Triangle1(double a, double b, double c, double m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.m = m;
        adaptee = new MyTriangle1(a, b, c, m);
    }
    
    
    
    @Override
    public double area() {
        return adaptee.a();
    }

    @Override
    public double perim() {
        return adaptee.p();
    }
    
}
