import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

        //System.out.println(Arrays.toString(readIntegers()));
        System.out.println(findMin(readIntegers()));
    }

    public static int[] readIntegers() {
        System.out.print("Input numbers: ");
        Scanner scanner = new Scanner(System.in);

        String[] strIntegers = scanner.nextLine().split(",");
        int[] integers = new int[strIntegers.length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(strIntegers[i].trim());
        }

        return integers;
    }

    public static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
