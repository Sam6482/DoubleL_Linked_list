public class App {
    public static void main(String[] args) throws Exception {
        
        DoubleLinkedList List = new DoubleLinkedList();
        
        List.printForWard();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        
        List.printForWard();
        
        System.out.println("---------------------------");

        List.PrintBackWard();

        System.err.println("---------------------------");
        System.out.println("Eliminando el 3");

        List.remove(3);
        List.printForWard();

        System.out.println("---------------------------");
        List.remove(39);
    }
}
