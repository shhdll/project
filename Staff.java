//package project;

public abstract class Staff {

    protected int hours;
    protected String name;

    public Staff(int hours, String name) {
        this.hours = hours;
        this.name = name;
    }
    @Override
    public String toString(){
        return " hours: "+hours+" name: "+name;
    }

    public abstract double Salary(int h);

    // getters, setters
    public int getHours() { return hours; }

    public void setHours(int hours) { this.hours = hours; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
