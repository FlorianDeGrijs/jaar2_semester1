package packtpub.linkedlist;

public class NodeObject {
    NodeObject next;
    Object data;

    public NodeObject(Object data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return " " + data;
    }
}
