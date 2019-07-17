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
public class SpecialFile extends FileSystemItem {

    private int size;
    private String attribute;
    
    public SpecialFile(String name, int size, String attribute) {
        super(name);
        this.size = size;
        this.attribute = attribute;
    }

    @Override
    public void draw() {
        super.draw();
        
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    
    
    
}
