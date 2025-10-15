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
    }
}
