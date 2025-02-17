package project;

public class Museum {
	//testtting
	//123
	private String name;
	private int numOfArts;
	private int numOfStaff;
	private int numOfPaintings;
	private int numOfSculptures;
	private Art ArtList[];
	private Staff StaffList[];

public Museum(String name,int sizeOfArt, int sizeOfStaff) {
	this.name=name;
	numOfArts=0;
	numOfStaff=0;
	ArtList= new Art[sizeOfArt];
	StaffList = new Staff[sizeOfStaff];
	numOfPaintings=0;
	numOfSculptures=0;	
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
