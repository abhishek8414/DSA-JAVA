
import java.util.Scanner;



public class Check_odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt(); 
        System.out.println("Your number is ="+number);    
        
        if(number%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        
    }
    
}
