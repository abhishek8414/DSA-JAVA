
import java.util.Scanner;

public class FunctionArgument {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number[] = {10,20,30,40,50,60,70,80};
        int nonchangable = 5;
        // class calling
        Call_By_Refrence.update(number, nonchangable);

        //print statement 
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ," + nonchangable);
        }
        System.out.println();

    }
}
class Call_By_Refrence{
    
    //Call by reference 
    public static void update(int number[], int nonchangable) {
        nonchangable = 10;
        for (int i = 0; i < number.length; i++) {
            number[i] = number[i] + 1;
        }
    }
}
