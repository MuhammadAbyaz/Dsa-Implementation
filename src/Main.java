import list.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doubleLinkedList = new DoublyLinkedList<>();

        doubleLinkedList.addLast(5);
        doubleLinkedList.addLast(4);
        doubleLinkedList.addLast(3);
        doubleLinkedList.addLast(2);

        doubleLinkedList.addAt(2, 1);
        System.out.println(doubleLinkedList.toString());
    }
}