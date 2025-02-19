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

public void setId(int id){this.id=id;}
public void setDate(int date){this.date=date;}
public void serArtist(String artist){this.artist=artist;}
public int getId(){return id;}
public int getDate(){return date;}
public String getArtist(){return artist;}

}
