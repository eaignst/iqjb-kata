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
public class Book extends LibraryItem{
    private String title;
    private String author;
    private String publicationDate;

    public Book(int numberOfCopies, String title, String author, String publicationDate) {
        super(numberOfCopies);
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    @Override
    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" + 
                "numberOfCopies=" + getNumberOfCopies() +
                ", title=" + title + ", author=" + author + ", publicationDate=" + publicationDate + '}';
    }
    
    
    
    
    
    
}
