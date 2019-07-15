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
public class Extra implements Product{

    private Product decorated;
    
    @Override
    public double price() {
        return decorated.price();
    }
    
    public Extra(Product decorated) {
        this.decorated = decorated;
    }
    
}
