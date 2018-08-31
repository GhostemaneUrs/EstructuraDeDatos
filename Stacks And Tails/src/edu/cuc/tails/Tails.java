/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.tails;

/**
 *
 * @author ajaramil
 * @param <T>
 */
public class Tails<T> {
    private NodeTails top,end;
    private int size;
    
    public Tails(){
        top = end = null;
        size = 0;              
    }
    
    public void enqueue(T valor){
        NodeTails <T> nodo = new NodeTails(valor);
        if (isEmpty()){
          top = end = nodo; 
         
        }else{
          end.setLink(nodo);
          end=nodo;
        }        
        size++;
    }
    
    public NodeTails<T> dequeue(){
         if (isEmpty())
             return null;
         else {
             NodeTails<T> nodo = this.top;
             top = top.getLink();
             size --;
             return nodo;
         }    
    }
    public T peekTails() throws Exception {
        if (!isEmpty()) { //Evaluar si es diferente de vacio
            System.out.println( top.getValor() );
          return (T) top.getValor(); //Retornar el valor que esta en el inicio
        } else {
            throw new Exception("La cola se encuentra vacia");
        }
    }
    
    public NodeTails peekNodeTails(){
        if (!isEmpty()) {
            return top;
        }
        else{
            return null;
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){    
     return top == null;
    }
    
    
    public NodeTails<T> getEnd(){
       return end;
    }

     public void display(){
       NodeTails nodo =this.top;
       System.out.println("La Cola de tamaño "+this.getSize()+ " es la siguiente:");
       while (nodo != null){
           System.out.println(nodo.getValor().toString());
           nodo=nodo.getLink();
       }
        
    } 
}
