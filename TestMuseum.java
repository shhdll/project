import java.io.*;
import java.util.*;
public class TestMuseum  {
      static Museum m1 = new Museum("Harmony museum", 100, 50);
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        int int1=0, int2=0, int3=0, int4=0, int5=0, int6=0, int7=0;
        String str1="", str2="", str3="";
        
        try {
        	File F1 = new File("museumInput.txt");
            Scanner fn = new Scanner(F1);

            int1 = fn.nextInt();
            str1 = fn.next();
             int2 = fn.nextInt();
             int3 = fn.nextInt();
             str2 = fn.next();
             int4 = fn.nextInt();
             int5 = fn.nextInt();
             str3 = fn.next();
             int6 = fn.nextInt();
             int7 = fn.nextInt();
             fn.close();
        }catch(IOException e) {
            System.out.println("!!");
        }
        Staff s1 = new Manager(int1,str1,int2);
        Staff s2 = new Artist(int3,str2, int4);
        Inspector s3 = new Inspector(int5, str3, int6, int7);
        m1.addStaff(s1);
        m1.addStaff(s2);
        m1.addStaff(s3);
        try {
          Art a1 = new Paintings(120, "1519", "Leonardo da Vinci", "oil painting", "Mona Lisa");
          Sculptures a2 = new Sculptures(113, "1345 BC", "ancient Egyptian", "clay", "Nefertiti");
            m1.addArt(a1);
            m1.addArt(a2);
        } catch (InvalidArtIdException e) {
            System.out.println(e.toString());
        }
        JFrame1 frame = new JFrame1(m1);
        frame.setVisible(true);
       
    }
   
}
