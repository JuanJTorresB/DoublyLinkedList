public class DoubleNode implements Comparable<DoubleNode>  {
    DoubleNode anterior;
    Object dato;
    DoubleNode siguiente;

    public DoubleNode(Object dato) {
        this.anterior = null;
        this.dato = dato;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                ", dato=" + dato +
                ", siguiente=" + siguiente +
                '}';
    }

    @Override
    public int compareTo(DoubleNode o) {
        return ((Comparable<Object>) this.dato).compareTo(o.dato);
    }
}
