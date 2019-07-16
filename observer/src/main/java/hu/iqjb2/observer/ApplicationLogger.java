/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.observer;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author avincze
 */
public enum ApplicationLogger {
    
    Instance;
    
    private Set<Logger> registry = new HashSet<>();
    
    public void attach(Logger logger){
        registry.add(logger);
    }
    
    
    public void detach(Logger logger){
        registry.remove(logger);
    }
    
    public void error(String message){
        registry.forEach(logger->logger.error(message));
    }
    
    
    public void info(String message){
        registry.forEach(logger->logger.info(message));
    }
}
