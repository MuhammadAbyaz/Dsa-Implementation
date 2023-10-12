package list;

public class DoubleLinkedList<T> {

    Node<T> head = null;
    Node<T> tail = null;
    int size = 0;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> previous;

        public Node(T data) {
            this.next = null;
            this.previous = null;
            this.data = data;
        }
    }

    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
    }

    public int size() {
        return size;
    }
}
