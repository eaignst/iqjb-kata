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
public enum FruitFactory {
    INSTANCE;
    
    private Map<String, Supplier<Fruit>> suppliers;

    FruitFactory() {
        this.suppliers = new HashMap<>();
        this.suppliers.put("a", Apple::new);
        this.suppliers.put("b", Banana::new);
        this.suppliers.put("o", Orange::new);
    }
    
    public Fruit create(String s){
        return this.suppliers.get(s).get();
    }
}
