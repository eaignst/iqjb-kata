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
public abstract class Validation {
    
    public final boolean validate(String input){
        for (int i = 0; i < input.length(); i++) {
            if (!check(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    protected abstract boolean check(char ch);
}