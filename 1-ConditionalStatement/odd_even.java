
import java.util.Scanner;

public class odd_even {

    // public static int check(int number) {
    //     if (number % 2 == 0) {
    //         System.out.println("Your number is even ");
    //     } else {
    //         System.out.println("Odd");
    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2==0){
            System.out.println("number is even");
        }else{
            System.out.println("odd");
        }

    }

}
