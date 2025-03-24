
    public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    // Add an item to the list
    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    // Remove an item from the list
    public boolean remove(Object data) {
        if (head == null) return false;

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(data)) {
                temp.next = temp.next.next;
                size--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Search for an item in the list
    public Object search(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.data instanceof Art && ((Art) temp.data).getName().equals(name)) {
                return temp.data;
            }
            if (temp.data instanceof Staff && ((Staff) temp.data).getName().equals(name)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    // Get the number of elements in the list
    public int getSize() {
        return size;
    }

    // Display all elements in the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


