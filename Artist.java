package project;

public class Artist extends Staff {
    
    protected int yearOfEx;

    public Artist(int hours, String name, int yearOfEx) {
        super(hours, name);
        this.yearOfEx = yearOfEx;
    }
    @Override
    public double Salary(int h) {
        return (hours * 500) + (100 * yearOfEx);
    }
    @Override
    public String toString(){
        return "Artist) "+super.toString()+", yearOfEx: "+yearOfEx+", Salary: "+Salary(getHours());
    }
    // getters, setters
    public void setYearOfEx(int yearOfEx) { this.yearOfEx = yearOfEx; }
    
    public int getYearOfEx() { return yearOfEx; }
}
