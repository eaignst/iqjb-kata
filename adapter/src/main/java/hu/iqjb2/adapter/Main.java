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
public class Main {
    
    public static void main(String[] args) {
        Shape circle = new Circle(6);
        System.out.println("perim: " + circle.perim() + ", area: " + circle.area());
    } 
}
