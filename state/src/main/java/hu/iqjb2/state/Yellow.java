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
public class Yellow implements LampState{

    @Override
    public LampState next() {
        return LampStatePool.INSTANCE.getState("red");
    }
    
      @Override
    public String name() {
        return "Yellow";
    }
    
}
