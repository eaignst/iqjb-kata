/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.streams1;

/**
 *
 * @author avincze
 */
public enum CommandProcessor {
    INSTANCE;
    
    public void process(Command command){
        command.execute();
    }
    
}