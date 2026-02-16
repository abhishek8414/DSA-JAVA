
public class max3numbers {

    // max of 3 numbers
    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b > c) {
            return b;

        } else {
            return c;
        }
    }

    // method with return value sum of a &b
    public static int add(int a, int b) {
        return a + b;
    }
    // simple java methord

    public static void sayHello() {
        System.out.println("Hello World !");
    }

    // main class 
    public static void main(String[] args) {
        //sayHello();

        //int result =   add(4,5);
        int result2 = max(5, 6, 9);

        System.out.println("MAX  of 3 number is " + result2);

    }
}
