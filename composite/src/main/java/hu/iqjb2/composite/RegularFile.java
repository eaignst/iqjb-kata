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
public class RegularFile extends FileSystemItem{

    private int size;
    
    public RegularFile(String name, int size) {
        super(name);
        this.size = size;
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
    
    
    
}
