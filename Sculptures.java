package project;

public class Sculptures {

	private String typeOfSculp;

    public Sculptures(int id,String date,String artist, String typeOfSculp ){
		super(id , date , artist);
		this.typeOfSculp = typeOfSculp;
		

 public String toString() {
    	return super.toString+" Type of sculpture: "+typeOfSculp;
    }

}
