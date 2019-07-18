/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.functional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 *
 * @author avincze
 */
public enum FruitFactory2 {
    INSTANCE;
    
    private Map<String, Fruit> suppliers;

    FruitFactory2() {
        this.suppliers = new HashMap<>();
        this.suppliers.put("a", new Apple());
        this.suppliers.put("b", new Banana());
        this.suppliers.put("o", new Orange());
    }
    
    public Fruit create(String s) throws CloneNotSupportedException{
        return (Fruit)this.suppliers.get(s).clone();
    }
}
