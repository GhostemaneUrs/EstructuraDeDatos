
package edu.cuc.metodosSimulacion;



/**
 *
 * @author Ghostemane
 * @param <T>
 */
public class Node<T> {
    private T informacion;
    private Node<T> siguiente;

    public Node() {
    }

    public Node(T informacion) {
        this.informacion = informacion;
    }

    public T getInformacion() {
        return informacion;
    }

    public void setInformacion(T informacion) {
        this.informacion = informacion;
    }

    public Node<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "" + informacion;
    }
    
    
    
}
