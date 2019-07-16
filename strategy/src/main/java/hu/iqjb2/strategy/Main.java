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
public class Main {
    
    public static void main(String[] args) {
        Validation validation = new Validation();
        String str = "abcd";
        System.out.println(str + " is " + (validation.validate(str) ? "valid": "not valid"));
        validation.setValidationStrategy(new LowerValidationStrategy());
        System.out.println(str + " is " + (validation.validate(str) ? "valid": "not valid"));
        
    }
    
}
