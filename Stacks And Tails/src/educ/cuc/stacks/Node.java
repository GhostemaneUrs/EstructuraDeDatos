
package educ.cuc.stacks;

public class Node <T> {
   private T valor;
   private Node<T> link; 
    
    public Node(){}
    
    public Node(T valor) {
        this.valor = valor;
        this.link = null;
    }

    public T  getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Node<T> getLink() {
        return link;
    }

    public void setLink(Node<T> link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return  valor.toString();
    }
   
   
}
