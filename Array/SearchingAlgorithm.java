
import java.util.Scanner;

public class SearchingAlgorithm {

    // linear search 
    public static int linearSearch(int rollnumber[], int key) {
        // traverse all node 
        for (int i = 0; i < rollnumber.length; i++) {
            if (rollnumber[i] == key) {
                return 1;//return index of found element 
            }
        }
        return -1;// not found 
    }

    //Bineary searching algorithm 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating an array
        System.out.println("Enter the number of student ");
        int n = sc.nextInt();

        int rollnumber[] = new int[n];// creating array

        System.out.println("Enter your rollNumber =");
        for (int i = 0; i < n; i++) {
            rollnumber[i] = sc.nextInt();
        }

        System.out.println(" Enter your roll number whose you want to search =");
        int key = sc.nextInt();

        // passing value to paramiter 
        int index = linearSearch(rollnumber, key);
        if (index == -1) {
            System.out.println("Not Found");

        } else {
            System.out.println("Your rollnumber is at  index " + index);
        }
        sc.close();
    }
}
