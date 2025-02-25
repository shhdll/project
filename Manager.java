package project;

public class Manager extends Staff {
	
	private int officeNum;
	public Manager(int hours, String name, int officeNum) {
		super(hours,name);
		this.officeNum=officeNum; 
	}
	@Override
	public double Salary(int h) {
    		return 1000*hours;
	}
	@Override
	public String toString(){
		return "Manager) "+super.toString()+", officeNum: "+officeNum+" ,Salary: "+Salary(getHours());
	}
 	//getters, setters
	public void setOfficeNum(int officeNum){this.officeNum=officeNum;}
	
	public int getOfficeNum(){return officeNum;}
	
}
