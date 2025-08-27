package Traversal_algorytms.depthFirstSearch;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Preorder: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Inorder: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder(tree.root);
        System.out.println();

        int valueSearch = 40;
        System.out.println("¿Existe " + valueSearch + "? " + tree.search(valueSearch));

        valueSearch = 90;
        System.out.println("¿Existe " + valueSearch + "? " + tree.search(valueSearch));

        tree.delete(20);
        System.out.print("Inorder tras eliminar 20: ");
        tree.inorder(tree.root);
        System.out.println();

        tree.delete(30);
        System.out.print("Inorder tras eliminar 30: ");
        tree.inorder(tree.root);
        System.out.println();

    }
}
