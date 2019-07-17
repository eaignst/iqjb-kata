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
public class RedYellow implements LampState{

    @Override
    public LampState next() {
        return LampStatePool.INSTANCE.getState("green");
    }
    
      @Override
    public String name() {
        return "RedYellow";
    }
}
