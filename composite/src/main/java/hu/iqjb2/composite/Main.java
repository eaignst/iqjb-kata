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
public class Main {
    
    public static void main(String[] args) {
        Directory root = new Directory("/");
        root.add(new RegularFile("rf1", 100));
        root.add(new RegularFile("rf2", 200));
        
        Directory dir1 = new Directory("dir1");
        dir1.add(new Directory("dir2"));
        dir1.add(new SpecialFile("sf1", 210, "ab"));
        dir1.add(new SpecialFile("sf2", 220, "cd"));
        root.add(dir1);
        
        root.draw();
        
        

    }
    
}
