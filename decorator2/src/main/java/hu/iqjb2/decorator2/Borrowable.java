/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.decorator2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author avincze
 */
public class Borrowable implements Product{
    
    private final LibraryItem libraryItem;
    private final Set<String> registry = new HashSet<>();
    
    public Borrowable(LibraryItem libraryItem) {
        this.libraryItem = libraryItem;
    }
    
    public void borrowItem(String name){
        registry.add(name);
        libraryItem.setNumberOfCopies(libraryItem.getNumberOfCopies()-1);
    }
    
    public void returnItem(String name){
        registry.remove(name);
        libraryItem.setNumberOfCopies(libraryItem.getNumberOfCopies()+1);
    }
    
    @Override
    public void info() {
        libraryItem.info();
        this.registry.forEach(System.out::println);
    }
    
}
