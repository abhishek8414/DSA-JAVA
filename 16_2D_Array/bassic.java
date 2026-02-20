
import java.util.Scanner;

public class bassic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your size  of row and coll : ");

        int row = sc.nextInt(), coll = sc.nextInt();

        int arr[][] = new int[row][coll];

        System.out.println("Enter your element : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coll; j++) {

                arr[i][j] = sc.nextInt();

            }

        }
        System.out.println("2D array is :");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coll; j++) {

                System.out.print(arr[i][j] + " ");

                
            }
            System.out.println();

        }

        sc.close();

    }

}
