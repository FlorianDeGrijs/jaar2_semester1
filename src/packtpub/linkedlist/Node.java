package packtpub.linkedlist;

public class Node {
    Integer data;
    Node next;

    public Node(Integer data) {
        this.data = data;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }
}
