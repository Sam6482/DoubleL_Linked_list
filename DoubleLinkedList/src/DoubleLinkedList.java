public class DoubleLinkedList {

Node head;
Node cola;

public void add(int data){
    
    //Creamos el nuevo nodo
    Node newNode = new Node(data);
    
    //Checamos si la lista esta vacia
    if (head == null) {

        head = newNode;
        return;
        
    }
    
    //si no esta vacia, recorremos todos los nodos hasta encontrar el que tenga la referencia (next)
    Node current = head;
     
    while (current.next != null) {
        
        current=current.next;
    }

    current.next = newNode; //Guarda el nuevo nodo
    newNode.prev = current; // En el nuevo nodo guarda la referencia del anterior 


}

public void printForWard(){

    if (head == null) {
        System.out.println("La lista esta vacia");
        return;
    }
    
    Node current = head;

    while (current != null) {

        System.out.println(current.data);
        current = current.next;
    }

    System.out.println("null");

}


public void PrintBackWard(){

     if (head == null) {
        System.out.println("La lista esta vacia");
        return;
    }
    
    Node current = head;

    while (current.next != null) {

      
        current = current.next;
    }

    while (current != null) {
        
          System.out.println(current.data);
          current = current.prev;
    }
      
    System.out.println("null");
}


    public void remove(int value) {
        // Verificar si la lista está vacía
        if (head == null) {
            System.out.println("La lista está vacía, no se puede eliminar " + value);
            return;
        }

        Node current = head;

        // Buscamos el nodo que contiene el valor a eliminar
        while (current != null && current.data != value) {
            current = current.next;
        }

        // Si no se encontró el valor, salir
        if (current == null) {
            System.out.println("El valor " + value + " no se encontró en la lista.");
            return;
        }

        //  Si el nodo a eliminar es el head
        if (current == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                // Si se eliminó el único elemento
                cola = null;
            }
        } 
        //  Si el nodo a eliminar no es el primero
        else {
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                // Si se eliminó el último nodo, actualizar la cola 
                cola = current.prev;
            }
        }

        System.out.println("Se eliminó el valor: " + value);
    }


}
