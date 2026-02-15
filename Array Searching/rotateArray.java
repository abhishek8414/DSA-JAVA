
import java.util.Scanner;

public class rotateArray {
    
    //Function to take input of an array 
    // public static int[] inputArray(Scanner sc) {
    //     System.out.print("Enter array size: ");
    //     int n = sc.nextInt();

    //     int arr[] = new int[n];

    //     System.out.println("Enter array elements:");
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = sc.nextInt();
    //     }

    //     return arr;
    // }
    // function of rtake input array from user 
    public static int[] nums(Scanner sc){
        System.out.println(" Enter the size of an array :- ");
        int  n=sc.nextInt();

        int array[]=new int[n];

        System.out.println("Enter your array element :- ");
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();

            
        }



        return array;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int nums[]=inputArray(sc);
        int Arr[]=inputArray(sc);
    
        
        // printing Array
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
            
        }



    

    }
}
