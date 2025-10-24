public class AverageArray {
    public static int average( int numbers[]){
        int total=0;
        

        for(int i=0;i<numbers.length;i++){
             total=total+numbers[i];
        }
        return total;



    }
    public static void main(String[] args) {

        int numbers[]={20,39,48,76,89};

        int totalsum=average(numbers);

        float avg=totalsum/numbers.length;
        System.out.println("your array average is ="+avg);
        
        
    }
}
