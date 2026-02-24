public class SumArray {
    public static int  sum(int numbers []){

        int total=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length-1;i++){
           total= total+numbers[i];
        }
        return total;
    }




    public static void main(String[] args) {

        

        int numbers[]={10,44,22,58,98};

        int result =sum(numbers);

        System.out.println("Sum of All element in an array ="+result);

        



    }
}
