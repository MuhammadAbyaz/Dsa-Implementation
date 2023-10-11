package list;

public class LinkedList<T> {
    public static class Node<T> {
        T _data;
        Node<T> next;

        public Node(T data) {
            this.next = null;
            this._data = data;
        }
    }

        int size = 0;
        Node<T> head = null;
        Node<T> tail = null;

        public void add(T data) {
            Node<T> newNode = new Node<T>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        public void print() {
            Node<T> current = head;
            System.out.print("[");
            while (current.next != null) {
                System.out.print(current._data);
                System.out.print(", ");
                current = current.next;
            }
            System.out.print(tail._data);
            System.out.print("]");
            System.out.println();
        }

        public int size() {
            return size;
        }

        public T get(int index) throws IndexOutOfBoundsException, NullPointerException {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current._data;
        }

        public void insert(int index, T data) throws IndexOutOfBoundsException {
            Node<T> current = head;
            Node<T> newNode = new Node<T>(data);
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }

        public void remove(int index) {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
}
