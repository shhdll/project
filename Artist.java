package project;

public class Artist extends Staff {
   
	protected int yearOfEx;

 public Artist(int hours, String name, int yearOfEx) {
      super(hours,name);
      this.yearOfEx=yearOfEx; 
    }
    
 public double Salary(int h) {
   return (hours*500)+(100*yearOfEx);
    }
	
}
