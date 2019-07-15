/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.decorator2;

/**
 *
 * @author avincze
 */

public abstract class LibraryItem implements Product{

    private int numberOfCopies;

    public LibraryItem(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

   
    
}
