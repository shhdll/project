public class Paintings extends Art {
    private String typeOfPainting;
    public Paintings(int id, String date, String artist, String typeOfPainting, String name)throws InvalidArtIdException {
        super(id, date, artist, name);
        this.typeOfPainting = typeOfPainting;
    }
    @Override
    public String toString() {
        return super.toString() + ", Type of painting: " + typeOfPainting;
    }
    // getters, setters
    public String getTypeOfPainting() { return typeOfPainting; }
    public void setTypeOfPainting(String typeOfPainting) { this.typeOfPainting = typeOfPainting; }
}
