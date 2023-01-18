import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomIntArray = getRandomIntArray(5);
        System.out.println(Arrays.toString(randomIntArray));

        Arrays.sort(randomIntArray);
        int[] reversedArray = new int[randomIntArray.length];
        for (int i = 0; i < randomIntArray.length; i++) {
            reversedArray[(randomIntArray.length-1)-i] = randomIntArray[i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }

    public static int[] getRandomIntArray(int length) {
        Random random = new Random();
        int[] randomIntArray = new int[length];

        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[i] = random.nextInt(100);
        }

        return randomIntArray;
    }
}