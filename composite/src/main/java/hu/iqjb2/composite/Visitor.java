/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.composite;

/**
 *
 * @author avincze
 */
public interface Visitor {
    void visit(Directory arg);
    void visit(RegularFile arg);
    void visit(SpecialFile arg);
}
