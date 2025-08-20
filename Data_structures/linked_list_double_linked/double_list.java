public class double_list {
    private Node head;
    private Node queue;

    public double_list() {
        this.head = null;
        this.queue = null;
    }

    public void add_queue(int data) {
        Node latest = new Node(data);

        if (head == null) {
            head = latest;
            queue = latest;
        }else{
            queue.next = latest;
            latest.previous = queue;
            queue = latest;
        }
    }

    public void add_head(int data){
        Node latest = new Node(data);

         if (head == null) {
            head = latest;
            queue = latest;
        }else {
            latest.next = head;
            head.previous = latest;
            head = latest;
        }
    }

    public void remove (int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
            if (current == head) {
                head = current.next;
                if (head != null) {
                    head.previous = null;
                } else {
                    queue = null; 
                }
                
            } else if (current == queue) {
                queue = current.previous;
                if (queue != null) {
                    queue.next = null;
                } else {
                    head = null; 
                }
                }else {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("The value wasn't found " + data);
    }

    public void print_forward(){

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");            
            current = current.next;
        }
        System.out.println();
    }

    public void print_backwards(){
        Node current = queue;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
        System.out.println();
    }
}
