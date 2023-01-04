public class NumberToWords {

    public static void main(String[] args) {

        System.out.println(getDigitCount(0));  // should return 1 since there is only 1 digit
        System.out.println(getDigitCount(123));  // should return 3
        System.out.println(getDigitCount(-12));  // should return -1 since the parameter is negative
        System.out.println(getDigitCount(5200)); // should return 4 since there are 4 digits in the number

        System.out.println(reverse(-121)); // should  return -121
        System.out.println(reverse(1212)); // should return  2121
        System.out.println(reverse(1234)); // should return 4321
        System.out.println(reverse(100));  // should return 1

        numberToWords(123);  // should print "One Two Three".
        numberToWords(1010); // should print "One Zero One Zero".
        numberToWords(1000); // should print "One Zero Zero Zero".
        numberToWords(-12);  // should print "Invalid Value" since the parameter is negative.
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number);
        int countNumber = getDigitCount(number);
        while (countNumber != 0) {
            switch (reversedNumber % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }

            reversedNumber /= 10;
            countNumber--;
        }


    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    public static int reverse(int number) {

        int copiedNumber = number;
        if (number < 0) {
            copiedNumber = -number;
        }

        int reversedNumber = 0;
        while (copiedNumber != 0) {
            reversedNumber = reversedNumber * 10 + copiedNumber % 10;
            copiedNumber /= 10;
        }

        if (number < 0) {
            reversedNumber *= -1;
        }

        return reversedNumber;
    }
}
