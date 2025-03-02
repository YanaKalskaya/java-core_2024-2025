package lr9;

public class ListMethods {

    private class Node {
        public int value;
        public Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;

    //a - методы с использованием цикла
    public void createHead(int size) {
        head = null;
        for (int i = 1; i <= size; i++) {
            head = new Node(i, head);
        }
    }

    public void createTail(int size) {
        if (size <= 0) return;
        head = new Node(1, null);
        Node current = head;
        for (int i = 2; i <= size; i++) {
            current.next = new Node(i);
            current = current.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.value).append(" ");
            current = current.next;
        }
        return result.toString().trim();
    }

    public void addFirst(int value) {
        head = new Node(value, head);
    }

    public void addLast(int value) {
        Node newtail = new Node(value);
        if (head == null) {
            head = newtail;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newtail;
    }

    public void insert(int value, int position) {
        if (position < 0) return;
        if (position == 0) {
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) return;
        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void remove(int position) {
        if (head == null || position < 0) return;
        if (position == 0) {
            removeFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next == null) return;
        current.next = current.next.next;
    }

    //б - методы с использованием цикла
    public void createHeadRec(int size) {
        head = createHeadRecHelper(size);
    }

    private Node createHeadRecHelper(int size) {
        if (size == 0) return null;
        Node newNode = new Node(size);
        newNode.next = createHeadRecHelper(size - 1);
        return newNode;
    }

    public void createTailRec(int size) {
        head = createTailRecHelper(1, size);
    }

    private Node createTailRecHelper(int current, int size) {
        if (current > size) return null;
        Node newNode = new Node(current);
        newNode.next = createTailRecHelper(current + 1, size);
        return newNode;
    }

    public String toStringRec() {
        return toStringRecHelper(head).trim();
    }

    private String toStringRecHelper(Node current) {
        if (current == null) return "";
        return current.value + " " + toStringRecHelper(current.next);
    }
}
