public class LinkedList {
    // Primer nodo de la lista
    private Node head;

    //Agregar al final
    public void add(int data) {
        // Creamos un nodo nuevo con el valor recibido
        Node newNode = new Node(data);

        // Comprobamos si la lista está vacia
        if (head == null) {
            head = newNode;
            return;
            // Si la lista está vacia el nuevo nodo se convierte en nuestro head
        }
        // Variable temporal para recorrer la lista sin modificar el head 
        Node current = head;
        // Recorremos hasta encontrar el último nodo
        while (current.next != null) {
            current = current.next;
        }
        // Aqui salimos del while, por lo tanto el valor de current queda al final
        current.next = newNode;
    }

    //Mostrar la lista
    public void printList() {
        //Creamos una variable auxiliar que apunta a la cabecera de la lista (así no modificamos el head)
        Node current = head;

        // Recorremos la lista hasta llegar al final
        while (current != null) {
            // Imprimimos el  valor del nodo actual
            System.out.print(current.data + " -> ");
            // Pasamos al siguiente nodo
            current = current.next;
        }
        // Indicamos que la lista terminó con la palabra null
        System.out.println("null");
    }

    // Eliminar un elemento
    public void remove (int data) {
        // Comprobamos si la lista está vacía, si es así salimos del método
        if (head == null) {
            return;
        }

        // Caso especial, eliminar el primer nodo
        if (head.data == data) {
            //Si queremos eliminar el primer nodo hacemos que el puntero apunte al siguiente y head queda sin referencia, por lo tanto se descarta
            head = head.next;
            return;
        }
        // Variable auxiliar para recorrer la lista
        Node current = head;

        // Buscamos el nodo anterior al que queremos eliminar
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        //Eliminamos el nodo de ser encontrado
        if (current.next != null) {
            //Desplazamos el puntero hasta que no tenga referencia
            current.next = current.next.next;
        }
    }

    // Buscar un elemento
    public boolean contains (int data){
        // Variable auxiliar
        Node current = head;
        // Recorremos hasta el final
        while (current != null) {
            // Comparamos el valor actual con el que estamos buscando
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        // Si no encontramos el valor deseado retorna falso
        return false;
    }

}
