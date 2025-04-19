//package project;
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
    public boolean removeFromFront(Object data) {
        if (head == null) return false;
        head = head.next;
        return true;
    }
    // Remove from back
    public boolean removeFromBack(Object data) {
        if (head == null) return false;
        if (head.next == null) {
            head = null;
            return false;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return true;
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
    public Object search(String data) {
        Node current = head;
        while (current != null) {
            Object obj = current.data;
    
            if (obj instanceof Art) {
                Art art = (Art) obj;
                if (art.getName().equals(data)) {
                    return art;
                }
            } else if (obj instanceof Artist) {
                Artist artist = (Artist) obj;
                if (artist.getName().equals(data)) {
                    return artist;
                }
            } else if (obj instanceof Inspector) {
                Inspector inspector = (Inspector) obj;
                if (inspector.getName().equals(data)) {
                    return inspector;
                }
            }
            // Add more conditions if needed for Manager, etc.
            current = current.next;
        }
        return null;
    }    
}
