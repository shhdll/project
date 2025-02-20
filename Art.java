package project;

public class Art {

    protected int id;
    protected int date;
    protected String artist;
    protected String name;

    public Art(int id, int date, String artist, String name) {
        this.id = id;
        this.date = date;
        this.artist = artist;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + " Date: " + date + " Artist: " + artist+ " name: "+name;
    }

    // Getters and Setters
    public void setId(int id) { this.id = id; }

    public void setDate(int date) { this.date = date; }

    public void setArtist(String artist) { this.artist = artist; }

    public int getId() { return id; }

    public int getDate() { return date; }

    public String getArtist() { return artist; }
}
