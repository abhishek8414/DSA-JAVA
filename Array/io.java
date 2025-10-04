
import java.util.Scanner;

public class io {
    public static void main(String[] args) {
     int marks[]=new int [100];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your marks");
      
      marks[1]=sc.nextInt();
      marks[2]=sc.nextInt();
      marks[3]=sc.nextInt();
      marks[4]=sc.nextInt();

      System.err.println("phy :"+ marks[1]);
      System.out.println("che :"+marks[2]);
      System.out.println("math :"+marks[3]);
    }

    
}
