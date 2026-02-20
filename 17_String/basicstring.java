import java.util.Scanner;

public class basicstring {
    // taking input from user 
    public  static void inputString(){
        Scanner sc = new Scanner(System.in);
        
        String name;

        System.out.println("Enter your string:");
        name = sc.nextLine();

        System.out.println(name);

    };
    


    public static void main(String[] args) {
        

        inputString();

        
    }
}