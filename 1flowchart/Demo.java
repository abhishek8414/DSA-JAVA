import java.util.Scanner;

public class Demo {

    // method to take input from user
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        int[] arr = new int[3];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        return arr;
    }

    // method to find max
    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    public static void main(String[] args) {

        int[] nums = takeInput();   // call input method

        int max = findMax(nums[0], nums[1], nums[2]);  // call max method

        System.out.println("Maximum = " + max);
    }
}