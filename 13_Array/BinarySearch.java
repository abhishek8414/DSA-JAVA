
import java.util.Scanner;

public class BinarySearch {
    //Write a Program to  implement Binary Search 
     // binary search function
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid; // element found
            } 
            else if (arr[mid] < key) {
                start = mid + 1; // search right side
            } 
            else {
                end = mid - 1; // search left side
            }
        }
        return -1; // element not found
    }

    

    public static int update (int number[],int key){
        int start =0,
        end =number.length-1;

        while(start<=end){
            int mid =(start +end)/2;
            //comparsion 

            if(number[mid]==key){
                //found
                return mid;

            }
            if(number[mid]<key){//right
                start=mid+1;

            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //array 
        int number[]={10,20,30,40,50,60,70,80,90,100};
        int key =50;

        //  update(number,key);      

        //  int mango=update;
         
        
        


    }
}
