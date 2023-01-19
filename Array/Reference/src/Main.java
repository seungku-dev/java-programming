import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] intArray = new int[5];
        int[] anotherArray = intArray;

        anotherArray[0] = 1;
        System.out.println(Arrays.toString(intArray));

        referenceArray(anotherArray, 1, 5);
        System.out.println(Arrays.toString(intArray));
    }

    public static void referenceArray(int[] array, int index, int value) {

        array[index] = value;
    }
}