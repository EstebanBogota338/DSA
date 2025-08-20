public class Node {
    // Data se refiere a la información guardada en el nodo
    int data;
    // Next hace referencia al siguiente puntero en la lista
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null; 
        // Como nuestro constructor solo tiene next, esta lista es singly linked
    }
}
