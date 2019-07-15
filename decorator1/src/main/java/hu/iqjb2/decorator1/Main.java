/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.decorator1;

/**
 *
 * @author avincze
 */
public class Main {

    public static void main(String[] args) {
        Product product =
                new WhippedCream(new Milk(new Honey(new Coffe())));
        System.out.println(product.price());
        
        System.out.println(product.price());
        
        
    }
}
