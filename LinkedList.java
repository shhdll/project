package project;

public class LinkedList {
    private Node head;

    // Constructor
    public LinkedList() {
        this.head = null;
    }

    // Insert at front
    public void insertAtFront(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at back
    public void insertAtBack(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Remove from front
    public void removeFromFront(Object data) {
        if (head == null) return;
        head = head.next;
    }

    // Remove from back
    public void removeFromBack(Object data) {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Get size of list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

   
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public Node getHead(){
        return this.head;
    }
    public Node search(Object data) {
    Node current = head;
    while (current != null) {
        if (current.data.equals(data) ) {
            return current;
        }
        current = current.next;
    }
    return null;
}
}
