
import java.util.Scanner;



public class Ln {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number[]={10,20,30,40,50,60,70,80,90};
        int key=60;

        for(int i=0;i<number.length;i++){
            if(key==number[i]){
                System.out.println("number is present in that index = "+number[i]+key);

            }else{
                System.out.println(" number is not found ");
            }

        }
    }
    
}
