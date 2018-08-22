
package educ.cuc.stacks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Stacks<T> {

    private Node<T> top;
    private int size;

    public Stacks() {
        this.top = null;
        this.size = 0;
    }

    public void push(T nodo) {
        Node<T> nuevo = new Node<>();  //Definir nuevo nodo
        nuevo.setValor(nodo); //Agregar el valor al nodo 
        if (IsEmpy()) { //Evaluar si es vacia
            top = nuevo; //Agrega el valor nuevo 
        } else {
            nuevo.setLink(top); //Si no agrega el nuevo nodo al inicio
            top = nuevo;
        }
        size++; //Aumenta el tamaño
    }

    public T pop() {
        T valor = top.getValor();
        Node<T> nodo = top; //Nodo se le agrega el top
        if (!IsEmpy()) { //Evaluacion donde tiene que ser diferente de vacia
            setTop(nodo.getLink()); //Asignar primer nodo al siguiente
            setSize((this.getSize() - 1)); //Disminuye el tamaño
            nodo.setLink(null); //El nodo siguiente esta vacio
            return valor;
        } else {
            return null;
        }
    }

    public T peek() throws Exception {
       
        if (!IsEmpy()) { //Evaluar si es diferente de vacio
            System.out.println("|\t" + top.getValor() + "\t|");
          return top.getValor(); //Retornar el valor que esta en el inicio
        } else {
            throw new Exception("La pila se encuentra vacia");
        }
    }
    
    public Node peekNode(){
        if (!IsEmpy()) {
            return top;
        }
        else{
            return null;
        }
    }
    
    public static boolean validarExpresion(String cadena) throws Exception {
        Stacks<Character> stacks = new Stacks<>();
        char datoActual;
        char datoAnterior;
        for (int i = 0; i < cadena.length(); i++) {
            datoActual = cadena.charAt(i);
            if (datoActual == '(' || datoActual == '{' || datoActual == '[') {
                stacks.push(datoActual);
            } else {
                if(!stacks.IsEmpy()){    
                datoAnterior = (char) stacks.peekNode().getValor();
                    if (datoActual == ')' || datoActual == '}' || datoActual == ']') {
                        if (datoActual == ')' && datoAnterior == '(' || datoActual == '}' 
                                && datoAnterior == '{' || datoActual == ']' && datoAnterior == '[') {
                            stacks.pop();
                        }
                    }
                }
            }
        }
        return stacks.IsEmpy();
    }

    public Node getTop() {
        return top;
    }

    public boolean IsEmpy() {
        return  top == null;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (this.size > 0) {
            this.size = size;
        } else {
            this.size = 0;
        }
    }

    @Override
    public String toString() {
        Node<T> auxNode = top;
        String cad = "";
        while (auxNode != null) {
            System.out.println("|\t" + auxNode.getValor() + "\t|");
            System.out.println("-----------------");
            auxNode = auxNode.getLink();
        }
        return cad;
    }
    
    
    
    
    public static String getString(String archivo) throws IOException{
        String cadena = " ";
        try {
            FileReader file = new FileReader(archivo);
            BufferedReader lecturaFile = new BufferedReader(file);
            cadena = lecturaFile.readLine();
        } catch (FileNotFoundException ex) {
            System.out.println("Su archivo no existe");
        }
        return cadena;
    }
}

    
    

