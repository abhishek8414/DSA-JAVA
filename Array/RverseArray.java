
import java.util.*;
public class RverseArray {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Write your Array element ");
        int arr[]=new int[10];

        System.out.println("Index where you want to reverse ");
        





        ReverseArray.reverse(arr);


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        
        
    }
    
}


//------Recursion ke help se hm array ko reverse karenge without using any loops ----
class Recursion_Reverse{
    public static void ReverseArray(int arr[]){
        



    }
    
}
///-----Two pointer approach------ 
class ReverseArray{
    public static void reverse(int arr[]){
        int first=0,last=arr.length-5;

        while(first<=last){
            //---swapping----
            int temp=arr[last];

            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }
    }
}
