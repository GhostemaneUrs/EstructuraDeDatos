
package edu.cuc.metodosSimulacion;

import java.util.Iterator;

/**
 *
 * @author Ghostemane
 */
public class Queues<T> {
    private Node<T> inicio;
    private Node<T> ultimo;
    private int tamaño = 0;
    
    public boolean IsEmpy(){
        return inicio == null;
    }
    
    public void enqueue(T dato){
        Node<T> NuevoNodo = new Node<>(dato);
        if (IsEmpy()) {
            inicio = NuevoNodo;
            ultimo = NuevoNodo;
        } else {
            NuevoNodo.setSiguiente(null);
            ultimo.setSiguiente(NuevoNodo);
            ultimo = NuevoNodo;
        }
        tamaño++;
    } 
    public Node<T> dequeue(){
         if (IsEmpy())
             return null;
         else {
             Node<T> nodo = inicio;
             inicio = inicio.getSiguiente();
             tamaño --;
             return nodo;
         }
    }
    
     public int size() {
        int contador = 0;
        Node<T> currentNode = inicio;
        while (currentNode != null) {            
            contador++;            
            currentNode = currentNode.getSiguiente();
        }
        return contador;
    }
    
    public T peek(){
        if (IsEmpy()) {
            return null;
        } else {
            return inicio.getInformacion();
        }
    }

    public Iterator iterator(){
        Iterator<T> ite = new Iterator<T>() {
            Node<T> NuevoNodo = inicio;
        
            @Override
            public boolean hasNext() {
                return NuevoNodo != null;
            }

            @Override
            public T next() {
                if (hasNext()) {
                   T t = NuevoNodo.getInformacion();
                   NuevoNodo = NuevoNodo.getSiguiente();
                   return t;
                } else {
                    return null;
                }
            }
        };
       return ite;
    }
    
    @Override
    public String toString() {
        String cola = "";
        Node<T> NuevoNodo = inicio;
        while (NuevoNodo != null) {
            cola += NuevoNodo.getInformacion()+"\n";
            NuevoNodo = NuevoNodo.getSiguiente();
        }
        return cola;
    }
     public T getFirst() {
        if (IsEmpy()) {
            return null;
        } else {
           return inicio.getInformacion();
        }
    }
    
    public T getLast() {
        if (IsEmpy()) {
            return null;
        } else {
            return ultimo.getInformacion();
        }
    }
    
}
