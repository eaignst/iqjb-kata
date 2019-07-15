/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.chainoresponsibility;

/**
 *
 * @author avincze
 */
public class Main {
    
    
    public static Detector createChain(){
        Detector d500 = new D500(null);
        Detector d1000 = new D1000(d500);
        Detector d2000 = new D2000(d1000);
        Detector d5000 = new D5000(d2000);
        Detector d10000 = new D10000(d5000);
        Detector d20000 = new D20000(d10000);
        return d20000; 
    }
    public static void main(String[] args) {
        Detector detector = createChain();
        detector.detect(115500);
        detector.print();
    }
}
