package packtpub.linkedlist;

public class ObjectLinkedList {

    private NodeObject head;
    private int currentIndex;

    public ObjectLinkedList() {
        this.head = null;
        this.currentIndex = -1;
    }

    public Object getCurrentIndex(Integer index) {
        if (this.currentIndex < 0 || index > currentIndex) {
            System.out.println("Index not found");
            return -1;
        }
        NodeObject currentNode = head;
        for (int i = 0; i <= currentIndex; i++) {
            if (i == index) {
                break;
            }
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public void remove(Integer index) {
        if (index < 0 || index > currentIndex) {
            System.out.println("Index not found");
            return;
        }

        NodeObject currentNode = head;
        NodeObject previousNode = null;
        for (int i = 0; i <= currentIndex; i++) {
            if (i == index) {
                if (index == 0) {
                    head = currentNode.next;
                    break;
                }
                previousNode.next = currentNode.next;
                currentIndex--;
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void add(Object data) {
        NodeObject newNode = new NodeObject(data);
        if (head == null) {
            head = newNode;
            currentIndex++;
            return;
        }

        NodeObject currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        currentIndex++;
    }
    public String toString() {
        String delim = ",";
        StringBuffer stringBuffer = new StringBuffer();
        if (head == null) {
            return "LINKED LIST IS EMPTY";
        }
        NodeObject currentNode = head;
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
