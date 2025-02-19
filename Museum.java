package project;

public class Museum {
	
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
	if(numOfArts >ArtList.length)
		return false;
	ArtList[numOfArts++]=a;
	if(a instanceOf(Paintings))
		numOfPaintings++;

	if(a instanceOf(Sculptures))
		numOfSculpturess++;
	return true;
	    }
	 
 public boolean removeArt(Art a) { //aggregation
	 if(numOfArt>0){
		 for(int i=0 ; i<ArtList.length ; i++)
			 if(ArtList[i].grtId()==a.getId()){
				 ArtList[i]=ArtList[numOfArts-1];
					 ArtList[--numOfArt]=null;
			 }
		 if(a instanceof(Paintings))
			 numOfPaintings--;
		 if(a instanceOf(Sculptures))
		numOfSculpturess--;
		 return true;
	    }
	 return false;
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
