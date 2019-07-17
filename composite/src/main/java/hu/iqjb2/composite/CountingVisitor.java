/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.composite;

/**
 *
 * @author avincze
 */
public class CountingVisitor implements Visitor{

    private int numberOfDirectories = 0;
    private int numberOfRegularFiles = 0;
    private int numberOfSpecialFiles = 0;
    
    
    @Override
    public void visit(Directory arg) {
        numberOfDirectories++;
    }

    @Override
    public void visit(RegularFile arg) {
        numberOfRegularFiles++;
    }

    @Override
    public void visit(SpecialFile arg) {
        numberOfSpecialFiles++;
    }

    @Override
    public String toString() {
        return "CountingVisitor{" + "numberOfDirectories=" + numberOfDirectories + ", numberOfRegularFiles=" + numberOfRegularFiles + ", numberOfSpecialFiles=" + numberOfSpecialFiles + '}';
    }
    
    
}
