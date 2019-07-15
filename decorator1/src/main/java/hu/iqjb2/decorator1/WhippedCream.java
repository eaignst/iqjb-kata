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
public class WhippedCream extends Extra{
    
    public WhippedCream(Product decorated) {
        super(decorated);
    }

    @Override
    public double price() {
        return super.price() + 20 ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
