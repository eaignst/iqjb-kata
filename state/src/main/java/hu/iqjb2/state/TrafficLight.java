/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.state;

/**
 *
 * @author avincze
 */
public class TrafficLight {
    
    private LampState  lampState;

    public TrafficLight() {
        this.lampState = LampStatePool.INSTANCE.getState("red");
    }
    
    public void next(){
        lampState = lampState.next();
    }
    
    public String state(){
        return lampState.name();
    }
}
