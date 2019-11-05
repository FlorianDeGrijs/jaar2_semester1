package packtpub.linkedlist;

public class MainLinkedList {

    private static Node head;

    public static void main(String[] args) {
        ObjectLinkedList list = new ObjectLinkedList();
        list.add(15);
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(12);
        System.out.println(list);
        Object a = list.getCurrentIndex(2);
        System.out.println("RETRIEVED " +  a.toString());


    }
}
