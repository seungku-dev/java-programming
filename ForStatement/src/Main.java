public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {

            if (i%15 == 0) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }

            if (count == 5) {
                System.out.println();
                break;
            }
        }

        System.out.println(sum);
    }
}