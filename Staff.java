package project;

public abstract class Staff {
	
	 protected int hours;
	 protected String nname;

public Staff(int hours, String name) {	
	this.hours=hours;
	this.name = name;
	}
	
public abstract double  Salary(int h);

}
