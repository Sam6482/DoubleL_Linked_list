public class Node {
    int data;
    Node next;
    int Duracion;
    String name;

    public Node(String name, int Duracion) {
        this.data = data;
        this.next = null; //es opcional, pero no esta mal que lo pongas
         this.Duracion = Duracion;
        this.name = name;               //para que no se te olvide que la referncia al instanciarlo es null     
    }

    public int getDuracion() {
        return Duracion;
    }

    public String getName() {
        return name;
    }

    
}