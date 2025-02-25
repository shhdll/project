//package project;
import java.util.Scanner;

public class TestMuseum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Museum m1 = new Museum("museum", 100, 50);
        System.out.println("Welcome to our museum! \nAnd discover the wonders within");
        
        Staff s1 = new Manager(40, "shams", 455);
        Staff s2 = new Artist(20, "jawaher", 16);
        Inspector s3 = new Inspector(25, "shahad", 5, 15);
        
        Art a1 = new Paintings(120, "1519", "Leonardo da Vinci", "oil painting", "Mona Lisa");
        Sculptures a2 = new Sculptures(113, "1345 BC", "ancient Egyptian", "clay", "Nefertiti");
        
        m1.addArt(a1);
        m1.addArt(a2);
        
        m1.addStaff(s1);
        m1.addStaff(s2);
        m1.addStaff(s3);
        
        int choice;
        boolean b = true;
        
        do {
            System.out.println("------ Menu ------");
            System.out.println("1- Add art");
            System.out.println("2- Add staff");
            System.out.println("3- Remove art");
            System.out.println("4- Remove staff");
            System.out.println("5- Search art");
            System.out.println("6- Search staff");
            System.out.println("7- Exit");
            
            choice = input.nextInt();
            
            switch(choice) {
             case 1:  //add art
                    System.out.println("Enter P for painting, S for sculpture");
                    char artChoice = input.next().charAt(0);
                    input.nextLine(); // clean garbage
                    
                    if (artChoice == 'P' || artChoice == 'p') {   //adding painting
                    	
                        System.out.println("Enter ID: ");
                        	int id = input.nextInt();
                        input.nextLine(); // clean garbagr
                        System.out.println("Enter date: ");
                        	String date = input.nextLine();
                        System.out.println("Enter artist name: ");
                        	String artist = input.nextLine();
                        System.out.println("Enter the type of painting: ");
                        	String type = input.nextLine();
                        System.out.println("Enter painting name: ");
                        	String name = input.nextLine();

                        Art p = new Paintings(id, date, artist, type, name);
                        
                        if (m1.addArt(p)) 
                            System.out.println("Painting added successfully :)");
                         else 
                            System.out.println("looks like the museum is full :(");
                        
                    } 
                    else if (artChoice == 'S' || artChoice == 's') {   //adding sculpture
                    	
                        System.out.println("Enter ID: ");
                        	int id = input.nextInt();
                        input.nextLine(); // clean garbage
                        System.out.println("Enter date: ");
                        	String date = input.nextLine();
                        System.out.println("Enter artist name: ");
                        	String artist = input.nextLine();
                        System.out.println("Enter the material: ");
                        	String material = input.nextLine();
                        System.out.println("Enter sculpture name: ");
                        	String name = input.nextLine();

                        Art sculpture = new Sculptures(id, date, artist, material, name);
                        
                        if (m1.addArt(sculpture)) 
                            System.out.println("Sculpture added successfully :)");
                         else 
                            System.out.println("looks like the museum is full :(");
                        
                    }
                    else 
                        System.out.println("Invalid");
                    
                		                	
                    break;
                case 2:
                	
                    break;
                case 3:   //remove art
                	 System.out.println("Enter the ID of the art piece to remove:");
                	    int removeId = input.nextInt();

                	    Art artToRemove = m1.searchArt(removeId);
                	    
                	    if (artToRemove != null) {
                	        if (m1.removeArt(artToRemove)) 
                	            System.out.println("Art removed successfully :)");
                	         else 
                	            System.out.println("the museum is empty :(");
                	        
                	    } 
                	    else 
                	        System.out.println("not found");
                    break;
                case 4:
                	
                    break;
                case 5:
                	
                    break;
                case 6:
                	
                    break;
                case 7:
                	
                    b = false;
                    System.out.print("Thank you for using our system!");
                    break;
                default: 
                    System.out.println("Invalid, try again..");
            }
        } while(b);
    }
}
