//package project;

public class Art {

    protected int id;
    protected String date;
    protected String artist;
    protected String name;

    public Art(int id, String date, String artist, String name)throws InvalidArtIdException {
        if(id<0){
            throw new InvalidArtIdException();
        } 
        this.id = id;
        this.date = date;
        this.artist = artist;
        this.name = name;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Date: " + date + ", Artist: " + artist+ ", name: "+name;
    }

    // Getters and Setters
    public void setId(int id) { this.id = id; }

    public void setDate(String date) { this.date = date; }

    public void setArtist(String artist) { this.artist = artist; }

    public int getId() { return id; }

    public String getDate() { return date; }

    public String getArtist() { return artist; }

    public String getName(){return name;}

    public void setName(String name){ this.name = name;}
}
