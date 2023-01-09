import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int loopCount = 0;
        while (true) {

            try {
                sum += Integer.parseInt(scanner.nextLine());
                loopCount++;
            } catch (NumberFormatException nfe){
                if (loopCount > 0) {
                    average = Math.round((double)sum/loopCount);
                }

                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
    }
}
