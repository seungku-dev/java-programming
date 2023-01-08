public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(5);
        // printSquareStar(8);
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 0; i < number; i++) {
            System.out.print('*');
        }
        System.out.println();

        for (int i = 0; i < number-2; i++) {
            System.out.print('*');

            for (int j = 0; j < number - 2; j++) {
                if (j == i || j == (number - 3 - i)) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('*');
            System.out.println();
        }

        for (int i = 0; i < number; i++) {
            System.out.print('*');
        }
        System.out.println();
    }
}
