
import java.util.Scanner;

public class LinearSearch {

    // function to  take  array  input from user 
    public static int[] inputArray(Scanner sc) {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    // Function of linear Search
    public static int linearSearch(int Array[], int key) {
        for (int i = 0; i < Array.length; i++) {

            if (Array[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int arr[] = inputArray(sc);   // 👈 function call

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        int index = linearSearch(arr, key);

        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found");
        }

        sc.close();
    }

    //     int Array[] = {10, 20, 30, 40, 50};
    //     int key = 50;
    //     int index = linearSearch(Array, key);

    //     // System.out.println(index);
    //     if (index == -1) {
    //         System.out.println("Goven key is not present in this Array");
    //     } else {
    //         System.out.println("Key is present in an array ");
    //     }

    // }
}
