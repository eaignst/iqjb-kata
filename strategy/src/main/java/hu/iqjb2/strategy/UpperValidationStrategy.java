/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.strategy;

/**
 *
 * @author avincze
 */
public class UpperValidationStrategy implements ValidationStrategy{

    @Override
    public boolean check(char ch) {
        return Character.isUpperCase(ch);
    }
    
}
