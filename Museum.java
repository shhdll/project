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
	if(numOfArts >= ArtList.length)
		return false;
	ArtList[numOfArts++]=a;
	
	if(a instanceof(Paintings)) //check if art is a painting
		numOfPaintings++;

	if(a instanceof(Sculptures)) //check if art is a sculpture
		numOfSculpturess++;
	
	return true;
	    }
	 
 public boolean removeArt(Art a) { //aggregation
	 if(numOfArts>0){
		 for(int i=0 ; i<ArtList.length ; i++)
			 if(ArtList[i].getId()==a.getId()){
				 ArtList[i]=ArtList[numOfArts-1];
					 ArtList[--numOfArts]=null;
			 }
		 
	if(a instanceof(Paintings)) //check if art is a painting
			 numOfPaintings--;
		 
	if(a instanceof(Sculptures))  //check if art is a sculpture
		numOfSculpturess--;
		 
		 return true;
	    }
	 return false;
 }
 public Art searchArt(int id) { //aggregation
	  for(int i=0 ; i<ArtList.length ; i++)
			 if(ArtList[i].getId()==id)
				 return ArtList[i];
	 return null;
	    }
	 
public boolean addStaff(Staff e) { //composition
	if(numOfStaff >= StaffList.length)
		return false;
	StaffList[numOfStaff++]= new Staff(e.getHours() , e.getName());

	return true;
	    }

public boolean removeStaff(Staff e) { //composition
	if(numOfStaff >0)
		for(int i=0 ; i<StaffList.length ; i++){
			if(StaffList[i].getName() == e.getName()){
				StaffList[i]=StaffList[numOfStaff-1];
				StaffList[--numOfStaff]= null; 
			}
		}	
	return false;
	 }

public Staff searchStaff(String name) { //composition 
	for(int i=0; i<StaffList.length ; i++)
		if(StaffList[i].getName() == name)
			return StaffList[i];
	}
}
