
import java.util.Scanner;

public class FunctionArgument {

    public static void main(String[] args) {//this is main class 

        Scanner sc = new Scanner(System.in);

        int marks[] = {85, 95, 83};// this is an array

        int nonchangable = 500;
        // class calling
        System.out.println("this is call by referance");
        Call_By_Refrence.update(marks);
        


        //print statement 
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Updated Marks =" + marks[i] + " ");
        }
        System.out.println("This is call by value");
        Call_By_Value.call_value(marks, nonchangable);
         System.out.println("nonchangable after call = " + nonchangable); // no change

        //print nextline
        System.out.println();

    }
}

class Call_By_Value {

    public static void call_value(int marks[], int nonchangable) {
        nonchangable=1000;


    }
}

class Call_By_Refrence {

    //Call by reference 
    public static void update(int marks[]) {

        for (int i = 0; i < marks.length; i++) {

            marks[i] = marks[i] + 1;
        }
    }
}

// | Type                              | Function में change होने पर असर? |
// | --------------------------------- | -------------------------------- |
// | `int, float, boolean` (primitive) | ❌ No (value copy जाती है)        |
// | `array, String, object`           | ✅ Yes (reference जाता है)        |

