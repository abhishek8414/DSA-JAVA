
import java.util.Scanner;

public class stringleacture {

    // taking input from user 
    public static void inputString() {
        Scanner sc = new Scanner(System.in);

        String name;

        System.out.println("Enter your string:");
        name = sc.nextLine();

        
        System.out.println("This is your input String : " +name);
        System.out.println("Length of your String :" + name.length());

    }
    public static void stringcontianation(){
        String firstname = "ABhishek";
        String Lastname = " Sharma";
        // this line is String Contanitation 
        System.out.println(firstname + " " + Lastname);
        
    }

    public static void uppercase() {

    }


    public static void main(String[] args) {
        
        inputString(); // object calling 
        System.out.println("----------------------- ");
        stringcontianation();
        
        

        

    }
}
