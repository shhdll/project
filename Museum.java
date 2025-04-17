package project;
import java.io.*;
public class Museum implements Serializable {
    
    private String name;
    private int numOfArts;
    private int numOfStaff;
    private int numOfPaintings;
    private int numOfSculptures;
    private LinkedList ArtList;
    private LinkedList StaffList;

    public Museum(String name, int sizeOfArt, int sizeOfStaff) {
        this.name = name;
        numOfArts = 0;
        numOfStaff = 0;
        ArtList = new LinkedList(); 
        StaffList = new LinkedList();
        numOfPaintings = 0;
        numOfSculptures = 0;    
    }
    
    
   

    
  
    public boolean addArt(Art a) { //aggregation
    	   if (ArtList.isEmpty())  // This condition will never be true, should be corrected
               return false;

           ArtList.insertAtFront(a);

        if (a instanceof Paintings) //check if art is a painting
            numOfPaintings++;

        if (a instanceof Sculptures) //check if art is a sculpture
            numOfSculptures++;

        return true;
    }

    public boolean removeArt(Art a) { // Aggregation
        if (a == null || ArtList.isEmpty()) return false;
        if (ArtList.removeFromBack(a)) {
            if (a instanceof Paintings) numOfPaintings--;
            if (a instanceof Sculptures) numOfSculptures--;
            return true;
        }
        return false;
    }

    public Art searchArt(String name) { //aggregation
            Art result = (Art)ArtList.search(name);
                return result;
    }

    public boolean addStaff(Staff e) { //composition
    	if (StaffList.isEmpty())  // This condition will never be true, should be corrected
            return false;

        StaffList.insertAtFront(e);

        
        if (e instanceof Manager) {
            StaffList.insertAtFront(new Manager(e.getHours(), e.getName(), ((Manager) e).getOfficeNum()));
        } else if (e instanceof Inspector) {
            StaffList.insertAtFront(new Inspector(e.getHours(), e.getName(), ((Inspector) e).getYearOfEx(), ((Inspector) e).getNumOfInspections()));
        } else if (e instanceof Artist) {
            StaffList.insertAtFront(new Artist(e.getHours(), e.getName(), ((Artist) e).getYearOfEx()));
        }
        
        return true;
    }

    public boolean removeStaff(Staff e) { // Composition
        if (e == null || StaffList.isEmpty()) return false; // Check if staff object is null or list is empty

        // Try to remove the staff member from the list
        if (StaffList.removeFromBack(e)) {
            numOfStaff--; // Decrease the staff count
            return true;
        }
        return false; // Return false if removal fails
    }

    
    

    public Staff searchStaff(String name) { //composition 
    	 Staff result = (Staff)StaffList.search(name);
         return result;
}
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("The name of our museum is: ").append(name).append("\n");
        s.append(numOfPaintings).append(" paintings and ").append(numOfSculptures).append(" sculptures\n\n");

        s.append("Art Pieces:\n");
        Node temp = ArtList.getHead();  // Get the head node of the linked list
        while (temp != null) {
            s.append("  ✦ ").append(temp.data.toString()).append("\n");
            temp = temp.next;
        }

        s.append("\nand we have ").append(numOfStaff).append(" employees:\n");
        Node staffNode = StaffList.getHead(); // Assuming StaffList is a LinkedList
        while (staffNode != null) {
            s.append("  ✦ ").append(staffNode.data.toString()).append("\n");
            staffNode = staffNode.next;
        }

        return s.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
}
