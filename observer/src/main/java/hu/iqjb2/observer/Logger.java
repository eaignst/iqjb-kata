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
public abstract class Logger {
    
    public final void info(String message){
        log(message, "INFO");
        
    }
    
    public final void error(String message){
         log(message, "ERROR");
    }
    
    protected abstract void log(String message, String severity);
}
