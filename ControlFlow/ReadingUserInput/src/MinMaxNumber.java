import java.util.Scanner;

public class MinMaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        int loopCount = 0;
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (loopCount == 0 || number < minNumber) {
                    minNumber = number;
                }
                if (loopCount == 0 || number > maxNumber) {
                    maxNumber = number;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("Min: " + minNumber);
            System.out.println("Max: " + maxNumber);
        } else {
            System.out.println("Not enough data");
        }
    }
}
