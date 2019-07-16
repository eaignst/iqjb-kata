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
public class Validation {
    public  boolean validate(String input){
        for (int i = 0; i < input.length(); i++) {
            if (!validationStrategy.check(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public Validation() {
        this.validationStrategy = new DigitValidationStrategy() ;
    }
    
    
    
    private ValidationStrategy validationStrategy;

    public void setValidationStrategy(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }
    
}
