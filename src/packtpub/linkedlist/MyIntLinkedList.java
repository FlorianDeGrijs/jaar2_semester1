package packtpub.linkedlist;

public class MyIntLinkedList {

    private Node head;

    public MyIntLinkedList() {
        this.head = null;
    }

    public void add(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public String toString() {
        String delim = ",";
        StringBuffer stringBuffer = new StringBuffer();
        if (head == null) {
            return "LINKED LIST IS EMPTY";
        }
        Node currentNode = head;
        while (currentNode != null) {
            stringBuffer.append(currentNode.data);
            currentNode = currentNode.next;
            if (currentNode != null) {
                stringBuffer.append(delim);
            }
        }
        return stringBuffer.toString();
    }
}
