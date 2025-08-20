public class Main {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.printList();

        list.remove(20);

        System.out.println();

        list.printList();

        System.out.println();

        System.out.println("¿Contiene 30? " + list.contains(30));
        System.out.println("¿Contiene 50? " + list.contains(50));
    }
}
