package list;

public class LinkedList {
    int size = 0;
    Node head = null;
    Node tail = null;

    public void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void print (){
        Node current = head;
        System.out.print("[");
        while (current.next != null){
            System.out.print(current._data);
            System.out.print(", ");
            current = current.next;
        }
        System.out.print(tail._data);
        System.out.print("]");
    }

    public int size(){
        return size;
    }
}
