//package project;

public class Manager extends Staff {
	
	private int officeNum;
	public Manager(int hours, String name, int officeNum) {
		super(hours,name);
		this.officeNum=officeNum; 
	}
   
	public double Salary(int h) {
    		return 1000*hours;
	}
	
 	//getters, setters
	public void setOfficeNum(int officeNum){this.officeNum=officeNum;}
	
	public int getOfficeNum(){return officeNum;}
	
}

