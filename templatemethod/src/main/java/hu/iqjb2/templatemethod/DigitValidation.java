/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.templatemethod;

/**
 *
 * @author avincze
 */
public class DigitValidation extends Validation {

    @Override
    protected boolean check(char ch) {
        return Character.isDigit(ch);
    }
    
}
