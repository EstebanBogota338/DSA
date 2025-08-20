public class Main {
    public static void main(String[] args) {
        
        double_list list = new double_list();

        list.add_queue(10);
        list.add_queue(20);
        list.add_head(5);
        list.add_head(30);

        System.out.print("List forward: \n");
        list.print_forward();
        System.out.print("List backwards: \n");
        list.print_backwards();
        System.out.println();
        System.out.println("Removing 20...\n");
        list.remove(20);

        System.out.print("New list forward \n");
        list.print_forward();
    }
}
