
public class ArrayQuestion {
    public static void main(String[] args) {
        
        int array[] = {10, 20, 30, 80, 40};

        //------smallest element in an array--------
       int index= SmallinArray.smallest(array);

       System.out.println("Smallest element in an array ="+index);

        //--------large element in an array ---------

        //  int index=LargeinArray.getLargest(array);
        //  System.out.println("Largest number in array is ="+index);

    }
}

//Calculate the Sum and Average of all array elements
class Sum_Average{
    public static int Sum(int array[]){
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            
        }
        return -1;
    }

}

class SmallinArray{
    public static int smallest(int array[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]<smallest){
                smallest=array[i];



            }

        }
        return smallest;
    }
}

class LargeinArray{
    public static int getLargest(int array[]) {

        int bignumber = Integer.MIN_VALUE; //- infinity

        for (int i = 0; i < array.length; i++) { //traverse loop
            if (bignumber < array[i]) {  //condition
                bignumber = array[i];
            }

        }
        return bignumber;
    }
}
