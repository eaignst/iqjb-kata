/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.composite;

/**
 *
 * 
 * 
 * The visitor design pattern is a way of separating an operation 
 * from an object structure on which it operates. […] In essence, 
 * this pattern allows one to add new virtual functions to a family 
 * of classes without modifying the classes themselves; 
 * 
 * 
 * 
 * @author avincze
 */
public class XmlTransformationVisitor implements EmployeeVisitor{

    @Override
    public void visit(Employee arg) {
    }
    
}
