

public class LargestIN_Array {

    public static int getLargest(int number[]){
        int Largest=Integer.MIN_VALUE;

       for(int i=0; i<number.length;i++){
        if (Largest<number[i]){
            Largest=number[i];
        }
       }
        return Largest;
    }
    public static void main(String[] args) {
        // Array 
        int number[]={10,20,30,40,50,5,10000,6,5};

       int value= getLargest(number);

        System.out.println("Largest number in Array ="+value);



        // System.out.println("Enter Your Size Of an Array =");
        // int n=sc.nextInt();

        // int largest[]=new int[n];

        // System.out.println("Add element in an array =");

        // for(int i=0;i<n;i++){
        //     largest[i]=sc.nextInt();
        // }
  
        
    }
}
