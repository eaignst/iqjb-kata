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
public class Hdd extends ComputerPart {
    
    public Hdd(String name) {
        super(name);
    }
    
        @Override
    public String toString() {
        return "Hdd{"  + getName() + '}';
    }
}
