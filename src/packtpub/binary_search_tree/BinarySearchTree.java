package packtpub.binary_search_tree;

public class BinarySearchTree {
    private BSTNode root;
    private int data;
    private int size = 0;

    public BinarySearchTree() {
        root = new BSTNode(data);
    }

    public void traverseLeft() {
        BSTNode current = this.root;
        while (current != null) {
            System.out.println(current.data);
            current = current.left;
        }
    }

    public void traverseRight() {
        BSTNode current = this.root;
        while (current != null) {
            System.out.println(current.data);
            current = current.right;
        }
    }

    public int getLow() {
        if (this.root == null) {
            System.out.println("Root is null");
            return -1;
        }
        return getLow(this.root);
    }

    private int getLow(BSTNode root) {
        if (root.left == null) {
            return root.data;
        }
        return getLow(root.left);
    }

    public int getHigh() {
        if (this.root == null) {
            System.out.println("Root is null");
            return -1;
        }
        return getHigh(this.root);
    }

    private int getHigh(BSTNode root) {
        if (root.right == null) {
            return root.data;
        }
        return getHigh(root.right);
    }

    public void add(int data) {
        if (size == 0) {
            root.data = data;
            size++;
        } else {
            add(root, new BSTNode(data));
        }
    }

    private void add(BSTNode root, BSTNode bstNode) {
        if (root == null) {
            return;
        }
        if (bstNode.data < root.data) {
            if (root.left == null) {
                root.left = bstNode;
                size++;
            } else {
                add(root.left, bstNode);
            }
        } else if (bstNode.data > root.data) {
            if (root.right == null) {
                root.right = bstNode;
                size++;
            } else {
                add(root.right, bstNode);
            }
        }
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                ", data=" + data +
                ", size=" + size +
                '}';
    }
}
