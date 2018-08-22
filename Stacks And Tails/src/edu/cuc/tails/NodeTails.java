/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.tails;

/**
 *
 * @author ajaramil
 */
public class NodeTails<T> {
   private T valor;
   private NodeTails<T> link; 
    
    public NodeTails(){}
    
    public NodeTails(T valor) {
        this.valor = valor;
        this.link = null;
    }

    public T  getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NodeTails<T> getLink() {
        return link;
    }

    public void setLink(NodeTails<T> link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return  valor.toString();
    }
  
}
