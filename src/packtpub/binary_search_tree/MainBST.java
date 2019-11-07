package packtpub.binary_search_tree;

public class MainBST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(12);
        bst.add(27);
        bst.add(19);
        bst.add(16);
        bst.add(5);
        bst.add(3);
        bst.add(2);
        bst.add(84);
        bst.add(41);
        bst.add(32);
        bst.add(22);
        bst.add(11);
        bst.add(85);
        System.out.println(bst.getLow());
        System.out.println(bst.getHigh());
    }
}
