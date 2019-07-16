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
public class Main {

    public static void main(String[] args) {
        Validation upperValidation = new UpperValidation();
        String str = "abcd";
        System.out.println(str + " is " + (upperValidation.validate(str) ? "valid": "not valid"));
    }
}
