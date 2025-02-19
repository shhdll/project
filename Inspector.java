package project;

public class Inspector extends Staff {
	
	private int numOfInspections;
	
	public Inspector (int hours, String name, int yearOfEx,int numOfInspections) {
     		super(hours,name,yearOfEx);
     	        this.numOfInspections=numOfInspections; 
  	  }
    
 	public double Salary(int h) {
		return super.Salary+(numOfInspections*200);
	}
	public void setNumOfInspections(int numOfInspections){this.numOfInspections=numOfInspections;}
	public int getNumOfInspections(){reetuyrn numOfInspections;}
 
}
