public class Inspector extends Artist {
	private int numOfInspections;
	public Inspector (int hours, String name, int yearOfEx,int numOfInspections) {
     		super(hours,name,yearOfEx);
     	        this.numOfInspections=numOfInspections; 
  	  }
    @Override
 	public double Salary(int h) {
		return super.Salary(hours)+(numOfInspections*200);
	}
	@Override
 	public String toString(){
		return "inspector) "+"Name: " + getName() +", Hours: " + getHours()+ ", yearOfEx: " + yearOfEx +", Inspections: " + numOfInspections +", Salary: " + Salary(getHours());
	}
 	//getters, setters
	public void setNumOfInspections(int numOfInspections){this.numOfInspections=numOfInspections;}
	public int getNumOfInspections(){return numOfInspections;}
 
}
