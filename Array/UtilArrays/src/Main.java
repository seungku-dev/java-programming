import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Sort
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        System.out.println("-".repeat(20));

        // Fill
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        System.out.println("-".repeat(20));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        // CopyOf
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        System.out.println("-".repeat(20));

        // Binary Search
        String[] stringArray = {"a", "c", "d", "f", "z"};
        Arrays.sort(stringArray);
        if (Arrays.binarySearch(stringArray, "c") >= 0) {
            System.out.println("Found \"c\"");
        }

        System.out.println("-".repeat(20));

        // Equal
        int[] intArray1= {1,2,3,4,5};
        int[] intArray2= {1,2,3,4,5};

        if (Arrays.equals(intArray1, intArray2)) {
            System.out.println("Arrays are equal");
        }
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}