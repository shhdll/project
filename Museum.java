package project;

public class Museum {
	//testtting
	//123
	private String name;
	private int numOfArts;
	private int numOfStaff;
	private int numOfPaintings;
	private int numOfSculptures;

public Museum(String name,int numOfArts,int numOfStaff,int numOfPaintings,int numOfSculptures) {
	this.name=name;
	this.numOfArts=numOfArts;
	this.numOfStaff=numOfStaff;
	this.numOfPaintings=numOfPaintings;
	this.numOfSculptures=numOfSculptures;	
	    }
	
public boolean addArt(Art a) { //aggregation
	    }
	 
 public boolean removeArt(Art a) { //aggregation
	    }
	 
 public Art[] searchArt(String type) { //aggregation
	    }
	 
public boolean addEmployee(Employee e) { //composition
	    }

public boolean removeEmployee(Employee e) { //composition
	    }

public Employee searchEmployee(String name) { //composition 
	    }

}
