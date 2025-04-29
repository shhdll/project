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
    public boolean remove(Object data) {
        if (head == null) return false;
        // If the node to remove is at the head
        if (head.data.equals(data)) {
            head = head.next;
            return true;
        }
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (current.data.equals(data)) {
                if (previous != null) {
                    previous.next = current.next;
                }
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false; // Not found
    }
}
