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
public class Rectangle implements Shape{

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    
    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perim() {
        return 2 * (a + b);
    }
    
}
