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
public class SummingVisitor implements Visitor{

    private int totalSizeOfRegularFiles = 0;
    private int totalSizeOfSpecialFiles = 0;
    
    @Override
    public void visit(Directory arg) {
    }

    @Override
    public void visit(RegularFile arg) {
        totalSizeOfRegularFiles+=arg.getSize();
    }

    @Override
    public void visit(SpecialFile arg) {
        totalSizeOfSpecialFiles+=arg.getSize();
    }

    @Override
    public String toString() {
        return "SummingVisitor{" + "totalSizeOfRegularFiles=" + totalSizeOfRegularFiles + ", totalSizeOfSpecialFiles=" + totalSizeOfSpecialFiles + '}';
    }
  
    
}
