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
public abstract class FileSystemItem {
    
    private String name;
    protected  static int INDENT = 0;
    
    public abstract void accept(Visitor v);

    public FileSystemItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public  void draw(){
        for (int i = 0; i < INDENT; i++) {
            System.out.print("-");
        }
        System.out.println(getName());
    }
    
    
    
}
