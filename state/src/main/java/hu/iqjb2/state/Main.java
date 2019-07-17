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
public class Main {
    
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        System.out.println(trafficLight.state());
        
        trafficLight.next();
        System.out.println(trafficLight.state());
        
        trafficLight.next();
        System.out.println(trafficLight.state());
        
        trafficLight.next();
        System.out.println(trafficLight.state());
        
        trafficLight.next();
        System.out.println(trafficLight.state());
    }
    
}
