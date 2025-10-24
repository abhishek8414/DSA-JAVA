
import java.util.Scanner;

public class SearchingAlgorithm {

    // ----function to take input from user----
    public static int input(int rollNumber[]) { // sub function
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of student ");
         int n = sc.nextInt();//user input for size

        return n;
    }

    public static void main(String[] args) { // main  function
        Scanner sc = new Scanner(System.in);

        int n = input();
        int rollnumber[] = new int[n];// creating array

        System.out.println("Enter " + n + " rollNumber =");
        for (int i = 0; i < n; i++) {
            rollnumber[i] = sc.nextInt();
        }

        System.out.println(" Enter your roll number whose you want to search =");
        int key = sc.nextInt();

        //Linear search
        int index = LSearch.update(rollnumber, key);
        if (index == -1) {
            System.out.println("Not Found");

        } else {
            System.out.println("Your rollnumber is at  index " + index);
        }
        sc.close();
    }
}

class LSearch {
    // linear search 

    public static int update(int rollnumber[], int key) {
        // traverse all node 
        for (int i = 0; i < rollnumber.length; i++) {
            if (rollnumber[i] == key) {
                return 1;//return index of found element 
            }
        }
        return -1;// not found 
    }
}

class BSearch {//BinarySearch

    public static int update(int number[], int key) {
        int start = 0, end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            //comparsion 

            if (number[mid] == key) {
                //found
                return mid;

            }
            if (number[mid] < key) {//right
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
