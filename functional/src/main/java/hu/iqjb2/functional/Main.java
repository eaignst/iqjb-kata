/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.functional;

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
    }
    
}
