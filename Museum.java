//package project;

public class Museum {
    
    private String name;
    private int numOfArts;
    private int numOfStaff;
    private int numOfPaintings;
    private int numOfSculptures;
    private Art ArtList[];
    private Staff StaffList[];

    public Museum(String name, int sizeOfArt, int sizeOfStaff) {
        this.name = name;
        numOfArts = 0;
        numOfStaff = 0;
        ArtList = new Art[sizeOfArt];
        StaffList = new Staff[sizeOfStaff];
        numOfPaintings = 0;
        numOfSculptures = 0;    
    }

    public boolean addArt(Art a) { //aggregation
        if (numOfArts >= ArtList.length)
            return false;
        ArtList[numOfArts++] = a;

        if (a instanceof Paintings) //check if art is a painting
            numOfPaintings++;

        if (a instanceof Sculptures) //check if art is a sculpture
            numOfSculptures++;

        return true;
    }

    public boolean removeArt(Art a) { //aggregation
        if (numOfArts > 0) {
            for (int i = 0; i < ArtList.length; i++) {
                if (ArtList[i].getId() == a.getId()) {
                    ArtList[i] = ArtList[numOfArts - 1];
                    ArtList[--numOfArts] = null;
                }
            }

            if (a instanceof Paintings) //check if art is a painting
                numOfPaintings--;

            if (a instanceof Sculptures) //check if art is a sculpture
                numOfSculptures--;

            return true;
        }
        return false;
    }

    public Art searchArt(int id) { //aggregation
        for (int i = 0; i < ArtList.length; i++) {
            if (ArtList[i].getId() == id)
                return ArtList[i];
        }
        return null;
    }

    public boolean addStaff(Staff e) { //composition
       if (numOfStaff >= StaffList.length)
            return false;
        
        if (e instanceof Manager) 
            StaffList[numOfStaff++] = new Manager(e.getHours(), e.getName(), ((Manager) e).getOfficeNum()); 
        
        else if (e instanceof Artist) 
            StaffList[numOfStaff++] = new Artist(e.getHours(), e.getName(), ((Artist) e).getYearOfEx()); 
        
        return true;
    }

    public boolean removeStaff(Staff e) { //composition
        if (numOfStaff > 0)
            for (int i = 0; i < StaffList.length; i++) {
                if (StaffList[i].getName().equals(e.getName())) {
                    StaffList[i] = StaffList[numOfStaff - 1];
                    StaffList[--numOfStaff] = null;
                }
            }
        return false;
    }

    public Staff searchStaff(String name) { //composition 
        for (int i = 0; i < StaffList.length; i++) {
            if (StaffList[i].getName().equals(name))
                return StaffList[i];
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
