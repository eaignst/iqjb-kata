/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author avincze
 */
public class Main2 {
    public static void main(String[] args) {
        List<Employee> eList = new ArrayList<>();
        
        
        Employee e = new Employee();
        e.setFirstName("fn1");
        e.setLastName("ln1");
        eList.add(e);
        
        
        e = new Employee();
        e.setFirstName("fn2");
        e.setLastName("ln2");
        eList.add(e);
        
        for (Employee employee : eList) {
            System.out.println(employee);
//             System.out.println(employee.toJSON());
//              System.out.println(employee.toXML());

            /*

            */
        }
        
        
        
    }
}
