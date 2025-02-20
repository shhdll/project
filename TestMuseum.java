package project;
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
                case 1:
                    break;
                case 2:
                    break;
                case 3:
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
