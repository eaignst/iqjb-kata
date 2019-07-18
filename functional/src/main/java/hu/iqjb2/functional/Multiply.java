/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.functional;

/**
 *
 * @author avincze
 */
public class Multiply implements Operation{

    @Override
    public int operate(int a, int b) {
        return a * b;
    }
    
}
