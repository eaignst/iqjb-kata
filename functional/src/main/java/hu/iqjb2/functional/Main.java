/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.functional;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author avincze
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println(new Accumulation().accum(0));
        
        System.out.println(new Accumulation().accum(0, new Add()));
        System.out.println(new Accumulation().accum(1, new Multiply()));
                
        System.out.println(new Accumulation().accum(0, new Add(),
                new Positive()));
        System.out.println(new Accumulation().accum(1, new Multiply(),
                new Even()));
        
        
        
        System.out.println(new Accumulation().accum(0,
            new Operation() {
                @Override
                public int operate(int a, int b) {
                    return a - b;
                }
            },
            new Predicate() {
                @Override
                public boolean test(int a) {
                    return (a %2) == 1;
                }
        }));
        
        
        
        System.out.println(new Accumulation().accum(1, 
                ( a,  b)->a+b,
                 a-> (a%2)==0));
        
        
        System.out.println(new Accumulation().accum2(1, 
                ( a,  b)->a+b,
                 a-> (a%2)==0));
        
        
        System.out.println(new Accumulation().accum2(1, 
                MyFunction::MYADD,
                MyFunction::MYEVEN));
        
        MyFunction myFunction = new MyFunction();
        System.out.println(new Accumulation().accum2(1, 
                myFunction::myadd,
                myFunction::myeven));
        
       
        System.out.println(
                FruitFactory.INSTANCE.create("o").hashCode()
        );
        
        System.out.println(
                FruitFactory.INSTANCE.create("o").hashCode()
        );
        
        System.out.println(
                FruitFactory.INSTANCE.create("o").hashCode()
        );
        
        System.out.println(
                FruitFactory.INSTANCE.create("b").hashCode()
        );
        
        List<Integer> si = new ArrayList<>();
        si.add(1);
        si.add(2);
        List<? extends Number> sn = si;
        //sn.add(33);
        sn.get(0);
        
        List<Number> sn2 = new ArrayList<>();
        sn2.add(3.14);
        sn2.add(3);
        
        List<? super Integer> si2 = sn2;
        si2.get(7);
        //si2.add(88.8);
        
        
        
        List<Object> objs = new ArrayList<Object>();
        objs.add(1);
        objs.add("two");
        List<? super Integer> ints = objs;
        ints.add(3); // ok
        ints.get(0);
        
        
        
        
        
        

}
        
        


    
}
