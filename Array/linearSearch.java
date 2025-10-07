
public class linearSearch {

    //linear search algo and code by apna college 
    public static int linearsearch(int array[], int key) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int key = 50;

        linearsearch(array, key);

        int index = linearsearch(array, key);
        if (index == -1) {
            System.out.println("Key is not avilable in array ");
        } else {
            System.out.println("Key is at index :-" + index);
        }

    }

}
