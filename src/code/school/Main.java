package code.school;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(12);
        bst.add(5);
        bst.add(16);
        bst.add(11);
        bst.add(3);
        bst.add(6);
        bst.add(15);
        bst.add(4);
        bst.add(11);

        bst.levelOrder();
    }
}
