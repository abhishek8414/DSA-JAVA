
import java.util.Scanner;



public class FunxtionArgument {

    //Call by reference 
    public static void update(int number[],int nonchangable){
        nonchangable=10;
        for(int i=0;i<number.length;i++){
            number[i]=number[i]+1;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc =new Scanner (System.in);
        int number[]= {20,60,90,80};
        int nonchangable=5;
        update(number,nonchangable);


        //print statement 
        for(int i=0; i <number.length;i++){
            System.out.print(number[i]+" ,"+nonchangable);
        }
        System.out.println();

    }
}
