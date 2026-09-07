public class MiListaDoble implements ListInterface{

    public DoubleNode head = null;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int getSize() {
        if (this.isEmpty()){return 0;}
        DoubleNode nodeIterator = this.head;
        int contador = 0;
        while (nodeIterator != null){
            contador += 1;
            nodeIterator = nodeIterator.siguiente;
        }
        return contador;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public Object getHead() {
        if (this.isEmpty()){return null;}
        return head;
    }

    @Override
    public Object getTail() {
        if (this.isEmpty()){return null;}
        DoubleNode nodeIterator = this.head;
        while (true){
            if (nodeIterator.siguiente == null){
                return nodeIterator.dato;
            }
            nodeIterator = nodeIterator.siguiente;
        }
    }

    public DoubleNode getTailNode() {
        if (this.isEmpty()){return null;}
        DoubleNode nodeIterator = this.head;
        while (true){
            if (nodeIterator.siguiente == null){
                return nodeIterator;
            }
            nodeIterator = nodeIterator.siguiente;
        }
    }

    @Override
    public Object get(DoubleNode node) {
        if (this.isEmpty()){return null;}
        DoubleNode nodeIterator = this.head;
        while (true){
            if (nodeIterator.dato.equals(node.dato)){
                return nodeIterator;
            }
            nodeIterator = nodeIterator.siguiente;
            if (nodeIterator == null){
                return null;
            }
        }
    }

    @Override
    public DoubleNode search(Object object) {
        if (this.isEmpty()){return null;}
        DoubleNode nodeIterator = this.head;
        while (true){
            if (nodeIterator.dato.equals(object)){
                return nodeIterator;
            }
            nodeIterator = nodeIterator.siguiente;
            if (nodeIterator == null){
                return null;
            }
        }
    }

    @Override
    public boolean add(Object object) {
        DoubleNode tailNode = getTailNode();
        if (tailNode == null) {return false;}
        tailNode.siguiente = new DoubleNode(object);
        return true;
    }

    @Override
    public boolean insert(DoubleNode node, Object object){
        DoubleNode insertNode = search(node.dato);
        return insertBaseMethod(object, insertNode);
    }

    @Override
    public boolean insert(Object objectRef, Object object) {
        DoubleNode insertNode = search(objectRef);
        return insertBaseMethod(object, insertNode);
    }

    private boolean insertBaseMethod(Object object, DoubleNode insertNode) {
        if (insertNode == null) {return false;}
        DoubleNode newNode = new DoubleNode(object);
        if (insertNode.anterior != null){
            insertNode.anterior.siguiente = newNode;
        }
        if (insertNode.siguiente != null){
            insertNode.siguiente.anterior = newNode;
        }
        newNode.anterior = insertNode.anterior;
        newNode.siguiente = insertNode;
        return true;
    }

    @Override
    public boolean insertHead(Object object) {
        DoubleNode insertNode = search(getHead());
        return insertBaseMethod(object, insertNode);
    }

    @Override
    public boolean insertTail(Object object) {
        DoubleNode insertNode = search(getTail());
        return insertBaseMethod(object, insertNode);
    }

    @Override
    public boolean set(DoubleNode node, Object object) {
        DoubleNode nodeBuscado = search(node.dato);
        if (nodeBuscado==null){return false;}
        search(node.dato).dato = object;
        return true;
    }

    @Override
    public boolean remove(DoubleNode node) {
        DoubleNode nodeBuscado = search(node.dato);
        if (nodeBuscado==null){return false;}
        nodeBuscado.anterior.siguiente = nodeBuscado.siguiente;
        nodeBuscado.siguiente.anterior = nodeBuscado.anterior;
        return true;
    }

    @Override
    public boolean contains(Object object) {
        if (this.isEmpty()){return false;}
        DoubleNode nodeIterator = this.head;
        while (true){
            if (nodeIterator.dato.equals(object)){
                return true;
            }
            nodeIterator = nodeIterator.siguiente;
            if (nodeIterator == null){
                return false;
            }
        }
    }

    @Override
    public Object[] toArray() {
        if (this.isEmpty()){return new Object[0];}
        int size = getSize();
        Object[] newArray = new Object[size];
        return toArrayBase(newArray, size);
    }

    @Override
    public Object[] toArray(Object[] object) {
        if (object.length < this.getSize()){return null;}
        int size = getSize();
        return toArrayBase(object, size);
    }

    private Object[] toArrayBase(Object[] object, int size) {
        DoubleNode nodeIterator = this.head;
        int contador = 0;
        while (nodeIterator != null){
            object[contador] = nodeIterator;
            nodeIterator = nodeIterator.siguiente;
            contador++;
            if (contador == size){
                return object;
            }
        }
        return new Object[0];
    }

    @Override
    public MiListaDoble subList(DoubleNode from, DoubleNode to) {
        return null;
    }

    @Override
    public MiListaDoble sortList() {
        return null;
    }
}
