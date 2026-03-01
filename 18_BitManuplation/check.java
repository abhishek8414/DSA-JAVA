
public class check {

    // Write a Program to check Bit set or not 
    public static boolean check(int n, int pos) {

        int mask = 1 << pos;
        if ((n & mask) == 00) {
            return false;
        } else {
            return true;
        }
    }

    // wap to set ith bit 
    public static int setBit(int n, int pos) {
        int mask = 1 << pos;

        return n | mask;
    }

    //toggle ith bit 
    public static int toggleBit(int n, int pos) {
        int mask = 1 << pos;
        return (n ^ mask);
    }

    // unset Bit 
    public static int unset(int n, int pos) {
        int mask = 1 << pos;
        return (n & (~mask));
    }

    public static void main(String[] args) {

        System.out.println(check(44, 3));

        System.out.println(setBit(20, 3));

        System.out.println(toggleBit(20, 1));
        System.out.println(unset(20, 2));
    }
}
