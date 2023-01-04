public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;

        if (number < 0) {
            sum = -1;
        } else if (number == 0) {
            sum = 0;
        } else {
            int FirstNum = number % 10;
            int LastNum = 0;

            while (number != 0) {
                if (number/10 == 0) {
                    LastNum = number;
                    break;
                }
                number /= 10;
            }
            sum = FirstNum + LastNum;
        }

        return sum;
    }
}
