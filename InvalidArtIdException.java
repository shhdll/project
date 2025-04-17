package packageMain;

public class InvalidArtIdException extends Exception {
    public InvalidArtIdException(){
        super("ART ID SHOULD NOT BE LESS THAN 0");
    }
    public InvalidArtIdException(String s){
        super(s);
    }
}
