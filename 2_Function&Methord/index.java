
import java.util.*;

public class index {

    // function hai ye  is me do number add hoga 
    public static void addTwonumber() {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;

        System.out.println(" sum of A and B =" + c);

    }

    //Swapping in Function 
    public static void swapping() {
        Scanner sc = new Scanner(System.in);

        int a = 5;
        int b = 9;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("after Swapping ");

        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }

    //product od A and B
    public static void int product(int a,int b){

        int product=a*b; 
        return 0;


    }

    public static void main(String[] args) {

        // addTwonumber();
       // swapping();

    }
}
