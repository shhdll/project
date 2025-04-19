//package packageMain;
public class Node {
   public Object  data;
    public Node next;
    public Node(Object o) {
        this.data = o;
        this.next = null;
    }
    public void setNext(Node n){
        this.next=n;
    }
}