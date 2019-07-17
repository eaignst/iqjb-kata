/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.composite;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author avincze
 */
public class Directory extends FileSystemItem{

    
    private Set<FileSystemItem> items = new HashSet<>();
    
    
    public Directory(String name) {
        super(name);
    }

    @Override
    public void draw() {
        super.draw();
        INDENT+=4;
        items.forEach(item->item.draw());
        INDENT-=4;
    }

    public void add(FileSystemItem item){
        items.add(item);
    }
    
    public void remove(FileSystemItem item){
        items.remove(item);
    }
    
}
