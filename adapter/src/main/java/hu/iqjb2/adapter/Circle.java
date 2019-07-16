/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.adapter;

import static java.lang.Math.PI;

/**
 *
 * @author avincze
 */
public class Circle implements Shape {

    private double radius;
    
    @Override
    public double area() {
        return radius * radius * PI;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    
    
    @Override
    public double perim() {
        return 2 * radius * PI;
    }
    
}
