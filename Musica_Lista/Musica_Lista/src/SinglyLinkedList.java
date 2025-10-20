
public class SinglyLinkedList {
    private Node head;

    public void addSong(String name, int Duracion) {
        //crecion del nodo
        Node newNode = new Node(name, Duracion);
        //verificacion si la lista esta vacia, entonces el nuevo nodo es la cabeza
        if (head == null) {
            head = newNode;
            return;
        }

        //si no esta vacia, recorremos todos los nodos hasta encontrar el que tenga la referencia (next)
        Node current = head;
        //vamos recorriendo los nodos,hasta que la referencia (next) sea didferente de null
        //si la referencia
        while (current.next!=null) {
          current= current.next;  
        }
        //se agrega el nuevo nnodo en la referencia del ultimo nodo
        current.next=newNode;
    }


    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.println(current.name + " - " + current.Duracion + "s");
            current = current.next;
        }
        System.out.println("null");
    }

    public void removeSong(String name){
        if(head == null)return;
        if(head.name == name){
            head = head.next;
        }
        Node current = head;
        while (current.next != null && current.next.name.equals(current.name)) {
            current = current.next;
        }
        //para eliminar no el que sigue,si no,el que sigue del que sigue
        current.next = current.next.next;
    }

      public int getTotalDuration() {
        int totalDuration = 0;
        Node current = head;
        while (current != null) {
            totalDuration += current.getDuracion();
            current = current.next;
        }
        return totalDuration;
    }
}
