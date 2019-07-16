/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.builder;

/**
 *
 * @author avincze
 */
public class Display extends ComputerPart {
    
    public Display(String name) {
        super(name);
    }
    
      @Override
    public String toString() {
        return "Display{" + getName() + '}';
    }
    
    
    
    
}
