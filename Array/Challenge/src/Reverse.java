import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array) {

        for (int i = 0; i <= (array.length-1)/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }
}