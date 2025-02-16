package project;

public class Art {
	
	protected int id;
	protected int date;
	protected String artist;

public Art(int id, int date, String artist) {	
	this.id=id;
	this.date=date;
	this.artist=artist;
    }
    
 public String toString() {
	return " ID : "+id+" Date : "+date+" Artist : "+artist;
    }

}
