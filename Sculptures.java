package project;

public class Sculptures extends Art {

    private String typeOfSculp;

    public Sculptures(int id, String date, String artist, String typeOfSculp, String name) {
        super(id, date, artist, name);
        this.typeOfSculp = typeOfSculp;
    }
    @Override
    public String toString() {
        return super.toString() + ", Type of sculpture: " + typeOfSculp; 
    }

    // getters, setters
    public String getTypeOfSculp() { return typeOfSculp; }

    public void setTypeOfSculp(String typeOfSculp) { this.typeOfSculp = typeOfSculp; }
}
