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
public class Main {
    
    public static void main(String[] args) {
        Book book = new Book(3, "booktitle1", "bookauthor1", "date1");
        Film film = new Film(3, "filmdirector1", "filmtitle1", "time1");
        
        book.info();
        film.info();
        
        Borrowable borrowable1 = new Borrowable(book);
        borrowable1.borrowItem("aaa");
        borrowable1.borrowItem("bbb");
        borrowable1.borrowItem("ccc");
        
        borrowable1.info();
        
        borrowable1.returnItem("bbb");
        borrowable1.returnItem("ccc");
        borrowable1.info();
        
        
        
        
        
    }
    
}
