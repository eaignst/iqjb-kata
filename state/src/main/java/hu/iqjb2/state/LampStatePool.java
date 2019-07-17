/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.state;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author avincze
 */
public enum LampStatePool {
    INSTANCE;
    
    private Map<String, LampState> pool;
    LampStatePool(){
        this.pool = new HashMap<>();
        this.pool.put("red", new Red());
        this.pool.put("green", new Green());
        this.pool.put("yellow", new Yellow());
        this.pool.put("redyellow", new RedYellow());
    }
    
    public LampState getState(String name){
        return pool.get(name);
    }
}
