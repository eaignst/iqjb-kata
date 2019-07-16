/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.observer;

/**
 *
 * @author avincze
 */
public class Main {
    
    public static void main(String[] args) {
        Logger console = new ConsoleLogger();
        Logger file = new FileLogger();
        Logger email = new EmailLogger();
        
        ApplicationLogger.Instance.info("this is the first info");
        ApplicationLogger.Instance.error("this is the first error");
        
        ApplicationLogger.Instance.attach(console);
        ApplicationLogger.Instance.info("this is the second info");
        ApplicationLogger.Instance.error("this is the second error");
        
        System.out.println("-----");
        
        ApplicationLogger.Instance.attach(email);
        ApplicationLogger.Instance.info("this is the third info");
        ApplicationLogger.Instance.error("this is the third error");
        
        System.out.println("-----");
           
        ApplicationLogger.Instance.detach(console);
        ApplicationLogger.Instance.info("this is the fourth info");
        ApplicationLogger.Instance.error("this is the fourth error");
        
        
        
        
        
        
        
        
        
    }
    
}
