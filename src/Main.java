void main() {
    MiListaDoble lista = new MiListaDoble();

    System.out.println("===== LISTA INICIAL =====");
    System.out.println("¿Está vacía?: " + lista.isEmpty());
    System.out.println("Tamaño: " + lista.getSize());


    // ==========================================
    // ADD
    // ==========================================

    System.out.println("\n===== ADD =====");

    lista.add(10);
    lista.add(20);
    lista.add(30);
    lista.add(40);

    System.out.println(lista);
    System.out.println("Tamaño: " + lista.getSize());


    // ==========================================
    // HEAD Y TAIL
    // ==========================================

    System.out.println("\n===== HEAD / TAIL =====");

    System.out.println("Head: " + lista.getHead());
    System.out.println("Tail: " + lista.getTail());
    System.out.println("Tail Node: " + lista.getTailNode());


    // ==========================================
    // SEARCH
    // ==========================================

    System.out.println("\n===== SEARCH =====");

    System.out.println("Buscar 20: " + lista.search(20));
    System.out.println("Buscar 100: " + lista.search(100));


    // ==========================================
    // CONTAINS
    // ==========================================

    System.out.println("\n===== CONTAINS =====");

    System.out.println("¿Contiene 30?: " + lista.contains(30));
    System.out.println("¿Contiene 100?: " + lista.contains(100));


    // ==========================================
    // INSERT HEAD
    // ==========================================

    System.out.println("\n===== INSERT HEAD =====");

    lista.insertHead(5);

    System.out.println(lista);


    // ==========================================
    // INSERT TAIL
    // ==========================================

    System.out.println("\n===== INSERT TAIL =====");

    lista.insertTail(50);

    System.out.println(lista);


    // ==========================================
    // INSERT ANTES DE UN ELEMENTO
    // ==========================================

    System.out.println("\n===== INSERT =====");

    lista.insert(30, 25);

    System.out.println(lista);


    // ==========================================
    // SET
    // ==========================================

    System.out.println("\n===== SET =====");

    DoubleNode nodo20 = lista.search(20);

    lista.set(nodo20, 22);

    System.out.println(lista);


    // ==========================================
    // GET
    // ==========================================

    System.out.println("\n===== GET =====");

    DoubleNode nodo30 = lista.search(30);

    System.out.println("Nodo encontrado: " + lista.get(nodo30));


    // ==========================================
    // TO ARRAY
    // ==========================================

    System.out.println("\n===== TO ARRAY =====");

    Object[] array = lista.toArray();

    for (Object object : array) {
        System.out.print(object + " ");
    }

    System.out.println();


    // ==========================================
    // SUBLIST
    // ==========================================

    System.out.println("\n===== SUBLIST =====");

    DoubleNode from = lista.search(22);
    DoubleNode to = lista.search(40);

    MiListaDoble subLista = lista.subList(from, to);

    System.out.println("Lista original: " + lista);
    System.out.println("Sublista: " + subLista);


    // ==========================================
    // REMOVE
    // ==========================================

    System.out.println("\n===== REMOVE =====");

    DoubleNode nodo25 = lista.search(25);

    lista.remove(nodo25);

    System.out.println("Después de eliminar 25:");
    System.out.println(lista);


    // ==========================================
    // SORT
    // ==========================================

    System.out.println("\n===== SORT =====");

    MiListaDoble listaDesordenada = new MiListaDoble();

    listaDesordenada.add(50);
    listaDesordenada.add(10);
    listaDesordenada.add(40);
    listaDesordenada.add(20);
    listaDesordenada.add(30);

    System.out.println("Original: " + listaDesordenada);

    MiListaDoble listaOrdenada = listaDesordenada.sortList();

    System.out.println("Ordenada: " + listaOrdenada);


    // ==========================================
    // CLEAR
    // ==========================================

    System.out.println("\n===== CLEAR =====");

    lista.clear();

    System.out.println("Lista después de clear: " + lista);
    System.out.println("¿Está vacía?: " + lista.isEmpty());
    System.out.println("Tamaño: " + lista.getSize());
}
