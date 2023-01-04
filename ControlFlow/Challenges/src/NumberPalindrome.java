public class NumberPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        int copiedNumber_ = number;
        int reversedNumber = 0;

        while (copiedNumber_ != 0) {
            reversedNumber = reversedNumber * 10 + copiedNumber_%10;
            copiedNumber_ /= 10;
        }

        return number == reversedNumber;
    }
}