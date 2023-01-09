import java.util.Scanner;

public class SumOfIntegers {

    public static void main(String[] args) {

        int sum = 0;
        int count = 1;

        Scanner scanner = new Scanner(System.in);
        boolean valid = false;

        while (count <= 5) {
            System.out.print("Enter number #" + count + ": ");

            try {
                sum += Integer.parseInt(scanner.nextLine());
                count++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }

        System.out.println(sum);
    }
}
