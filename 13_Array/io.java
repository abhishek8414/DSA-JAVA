import java.util.Scanner;

public class io {
    public static void main(String[] args) {
     int marks[]=new int [100];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your marks");  
      marks[0]=sc.nextInt();
      marks[1]=sc.nextInt();
      marks[2]=sc.nextInt();
      //marks[4]=sc.nextInt();

      //print  marks
      System.err.println("phy :"+ marks[0]);
      System.out.println("che :"+marks[1]);
      System.out.println("math :"+marks[2]);

      // percentage :-
      
      int percentage =(marks[0]+marks[1]+marks[2]/380+608);
      System.out.println("All marks Percentage is :- " +percentage+" %");
    }
}
