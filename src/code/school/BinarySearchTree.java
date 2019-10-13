package code.school;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value <= current.data) {
            current.left =  addRecursive(current.left, value);
        } else {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    public int findMin(Node root) {
        if (root == null) {
            return -1;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public int findMinRecursion(Node root) {
        if (root == null) {
            return -1;
        }
        if (root.left == null) {
            return root.data;
        }
        return findMinRecursion(root.left);
    }

    public int findMax(Node root) {
        if (root == null) {
            return -1;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public int findHeight(Node root) {
        if (root == null) {
            return -1;
        }
        int r = 1 + findHeight(root.right);
        int l = 1 + findHeight(root.left);
        return Math.max(r, l);
    }

    public void levelOrder() {
        if (root == null) {
            return;
        }
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty()) {
            Node current = Q.remove();
            System.out.println(" " + current.data);
            if (current.left != null) {
                Q.add(current.left);
            }
            if (current.right != null) {
                Q.add(current.right);
            }
        }
    }

    public void deleteNode(int value) {
        root = deleteNodeRecursive(root, value);
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }

    public void postOrderTraversal() {
        postOrderTraversalRecursive(root);
    }

    public void postOrderTraversalRecursive(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversalRecursive(root.left);
        inOrderTraversalRecursive(root.right);
        System.out.println(root.data + " ");
    }

    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    public void inOrderTraversalRecursive(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversalRecursive(root.left);
        System.out.println(root.data + " ");
        inOrderTraversalRecursive(root.right);
    }

    private Node deleteNodeRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }
        if (value == current.data) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            } else {
                int smallest = findSmallestValue(current.right);
                current.data = smallest;
                current.right = deleteNodeRecursive(current.right, smallest);
                return current;
            }
        }
        if (value <= current.data) {
            current.left = deleteNodeRecursive(current.left, value);
            return current;
        } else {
            current.right = deleteNodeRecursive(current.right, value);
            return current;
        }
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (current.data == value) {
            return true;
        }
        if (value <= current.data) {
            return containsNodeRecursive(current.left, value);
        } else {
            return containsNodeRecursive(current.right, value);
        }
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public void printRoot() {
        System.out.println(this.root);
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
