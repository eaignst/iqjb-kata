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
public class Film extends LibraryItem{
    
    private String director;
    private String title;
    private String playTime;

    public Film(int numberOfCopies, String director, String title, String playTime ) {
        super(numberOfCopies);
        this.director = director;
        this.title = title;
        this.playTime = playTime;
    }

    
    
    @Override
    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
           return "Film{" + 
                "numberOfCopies=" + getNumberOfCopies() +
                ", title=" + title + ", director=" + director + ", playTime=" + playTime + '}';
 
    
    }
    
    
    
    
    
}
