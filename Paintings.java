package project;

public class Paintings extends Art {
	
	private String typeOfPainting;

	public Paintings(int id,String date,String artist, String typeOfPainting ){
		super(id , date , artist);
		this.typeOfPainting = typeOfPainting;
		
	}
	    
public String toString() {
	return super.toString+" Type of painting: "+typeOfPainting;
	    }

}
