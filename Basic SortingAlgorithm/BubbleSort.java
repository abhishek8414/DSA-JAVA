
import java.util.Scanner;

public class BubbleSort {

    // Function of BubbleSorting :----------------------------------
    public static void bubbles(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length - 1 - i; j++) {
                if (number[j] > number[j + 1]) { // sewaping function 
                    // comparision 
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }
    }

    // main class :--------------------------------------------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // print messasges :--------------------------------------------
        System.out.println("Enter your Side of  Array Element  = ");
        int n = sc.nextInt();

        int number[] = new int[n];
        System.out.println(" Enter you  element of an array :-");
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println ("Your  original Array  Element Are : ");

        for (int i = 0; i < number.length; i++) {
            System.out.println(" " + number[i]);
        }

        bubbles(number);
        System.out.println(" your sorted array : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
            
        }

        // printing arrray element :----------------------------------
    }
}
