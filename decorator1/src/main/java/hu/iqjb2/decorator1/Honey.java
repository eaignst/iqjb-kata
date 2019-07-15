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
public class Honey extends Extra{
    
    public Honey(Product decorated) {
        super(decorated);
    }

    @Override
    public double price() {
        return super.price() + 30 ; //To change body of generated methods, choose Tools | Templates.
    }
    
}
