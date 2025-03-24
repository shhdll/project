package project;
import java.util.Scanner;
import java.util.*;

public class TestMuseum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Museum m1 = new Museum("Harmony museum", 100, 50);
        System.out.println("───────── ✦ Welcome Harmony museum ✦ ─────────  \n"
        		+ "         discover the wonders within!\n\n");
        
        Staff s1 = new Manager(40, "shams", 455);
        Staff s2 = new Artist(20, "jawaher", 16);
        Inspector s3 = new Inspector(25, "shahad", 5, 15);
        try {
            Art a1 = new Paintings(120, "1519", "Leonardo da Vinci", "oil painting", "Mona Lisa");
            Sculptures a2 = new Sculptures(113, "1345 BC", "ancient Egyptian", "clay", "Nefertiti");
            m1.addArt(a1);
            m1.addArt(a2);
        } catch (InvalidArtIdException e) {
            System.out.println(e.toString());
        }
        
       
        
        m1.addStaff(s1);
        m1.addStaff(s2);
        m1.addStaff(s3);
        
        int choice;
        boolean b = true;
        
        do {
            System.out.println("────────────────── ✦ Menu ✦ ─────────────────");
            System.out.println("1- Add art");
            System.out.println("2- Add staff");
            System.out.println("3- Remove art");
            System.out.println("4- Remove staff");
            System.out.println("5- Search art");
            System.out.println("6- display all information");
            System.out.println("7- Exit");
            
            choice = input.nextInt();
            
            if (choice < 1 || choice > 7) {
                System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                continue;
                }
            
            switch(choice) {
             case 1:  //add art
            	  input.nextLine();
                    System.out.println("Enter P for painting, S for sculpture");
                    char artChoice = input.next().charAt(0);
                    input.nextLine(); // clean garbage
                    
                    if (artChoice == 'P' || artChoice == 'p') {   //adding painting
                    	
                        System.out.println("Enter ID: ");
                        	int id = input.nextInt();
                        input.nextLine(); // clean garbage
                        System.out.println("Enter date: ");
                        	String date = input.nextLine();
                        System.out.println("Enter artist name: ");
                        	String artist = input.nextLine();
                        System.out.println("Enter the type of painting: ");
                        	String type = input.nextLine();
                        System.out.println("Enter painting name: ");
                        	String name = input.nextLine();

                        try {
                            Art p = new Paintings(id, date, artist, type, name);
                            if (m1.addArt(p)) 
                                System.out.println("Painting added successfully :)");
                            else 
                                System.out.println("looks like the museum is full :(");
                        } catch (InvalidArtIdException e) {
                            System.out.println(e.toString());
                        }
                        
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
                        try {
                            Art sculpture = new Sculptures(id, date, artist, material, name);
                            if (m1.addArt(sculpture)) 
                                System.out.println("Sculpture added successfully :)");
                            else 
                                System.out.println("looks like the museum is full :(");
                        } catch (InvalidArtIdException e) {
                            System.out.println(e.toString());
                        }
                        
                    }
                    else 
                        System.out.println("Invalid ");
                    
                		                	
                    break;
                    
                case 2:  //add staff
                    input.nextLine();
                    System.out.println("Enter M for Manager, A for Artist , I for Inspector");
                    char staffChoice = input.next().charAt(0);
                    input.nextLine(); // clean garbage
                    switch(staffChoice){
                        case 'M': case 'm':
                            System.out.print("Enter Hours: ");
                            int hours = 0;
                            boolean validInput = false;
                            while (!validInput) {
                                try {
                                    hours = input.nextInt();
                                    validInput = true;
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a valid integer for hours.");
                                    input.nextLine(); // Clear garbage
                                }
                            }

                            System.out.print("Enter Name: ");
                            String name = input.nextLine();
                            System.out.print("Enter Office Number: ");
                            int ofnum = input.nextInt(); // add input mismatch exception and add a loop
                            
                            Manager objM = new Manager(hours, name, ofnum);

                            if (m1.addStaff(objM)) 
                                System.out.println("Manager added successfully :)");
                            else 
                                System.out.println("looks like the museum is full :(");
                            break;

                        case 'A': case 'a':
                            System.out.print("Enter Hours: ");
                            int hours2 = 0;
                            boolean validInput2 = false;
                            while (!validInput2) {
                                try {
                                    hours2 = input.nextInt();
                                    validInput2 = true;
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a valid integer for hours.");
                                    input.nextLine(); // Clear garbage
                                }}

                            System.out.print("Enter Name: ");
                            String name2 = input.nextLine();
                            
                            System.out.print("Enter years of experience: ");
                            int yearOfEx = 0;
                            boolean validInput3 = false;
                            while (!validInput3) {
                                try {
                                    yearOfEx = input.nextInt();
                                    validInput3 = true;
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a valid integer for years of experience.");
                                    input.nextLine(); // Clear garbage
                                }
                            }

                            Artist a = new Artist(hours2, name2, yearOfEx);
                            if (m1.addStaff(a)) 
                                System.out.println("Artist added successfully :)");
                            else 
                                System.out.println("looks like the museum is full :(");
                            break;

                        case 'I': case 'i':
                            System.out.print("Enter Hours: ");
                            int hours3 = 0;
                            boolean validInput4 = false;
                            while (!validInput4) {
                                try {
                                    hours3 = input.nextInt();
                                    validInput4 = true;
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a valid integer for hours.");
                                    input.nextLine(); // Clear garbage
                                }
                            }

                            System.out.print("Enter Name: ");
                            input.nextLine(); // Clear garage
                            String name3 = input.nextLine();
                            

                            System.out.print("Enter years of experience: ");
                            int yearOfEx1 = 0;
                            boolean validInput5 = false;
                            while (!validInput5) {
                                try {
                                    yearOfEx1 = input.nextInt();
                                    validInput5 = true;
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a valid integer for years of experience.");
                                    input.nextLine(); // Clear garage
                                }
                            }

                            System.out.print("Enter number Of Inspections: ");
                            int Inspections = 0;
                            boolean validInput6 = false;
                            while (!validInput6) {
                                try {
                                    Inspections = input.nextInt();
                                    validInput6 = true;
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a valid integer for number of inspections.");
                                    input.nextLine(); // Clear garbage
                                }
                            }

                            Inspector objI = new Inspector(hours3, name3, yearOfEx1, Inspections);

                            if (m1.addStaff(objI)) 
                                System.out.println("Inspector added successfully :)");
                            else 
                                System.out.println("Looks like the museum is full :(");
                            break;

                        }

                    	
                        break;
                case 3:   //remove art
                	 input.nextLine();
                	 System.out.println("Enter the Name of the art piece to remove:");
                	    String removeName = input.nextLine();

                	    Art artToRemove = m1.searchArt(removeName);
                	    
                	    if (artToRemove != null) { 
                	        if (m1.removeArt(artToRemove)) 
                	            System.out.println("Art removed successfully :)");
                	         else 
                	            System.out.println("the museum is empty :(");
                	        
                	    } 
                	    else 
                	        System.out.println("not found");
                    break;
                case 4:   //remove staff
                	  input.nextLine();
                	 System.out.println("Enter staff name to remove: ");
                	    
                	    String staffName = input.nextLine();
                	    Staff s = m1.searchStaff(staffName);
                	    
                	    if (s != null) { 
                	        if (m1.removeStaff(s))
                	            System.out.println("Staff removed");
                	        else
                	            System.out.println("Failed to remove.");
                	    } else 
                	        System.out.println("Staff not found.");
                    break;
                case 5:
                	  input.nextLine();
                        System.out.println("Enter the name of Art piece you want to search for: ");
                        String SearchArt = input.nextLine();
                        Art artTOSearch = m1.searchArt(SearchArt);
                	    
                	    if (artTOSearch != null) {
                	            System.out.println("Art Have Been found successfully :)");
                                System.out.println(artTOSearch);
                        }
                	         else 
                	            System.out.println("the museum Do Not Have this piece :(");
                    break;
               
                case 6:
                    System.out.println(m1.toString());
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
