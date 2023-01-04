public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));
    }

    public static boolean hasSameLastDigit(int arg1, int arg2, int arg3) {

        if (!isValid(arg1) || !isValid(arg2) || !isValid(arg3)) {
            return false;
        }

        int lastDigit_1 = arg1 % 10;
        int lastDigit_2 = arg2 % 10;
        int lastDigit_3 = arg3 % 10;

        return (lastDigit_1 == lastDigit_2) ||  (lastDigit_1 == lastDigit_3) || (lastDigit_2 == lastDigit_3);
    }

    public static boolean isValid(int arg) {
        return arg >= 10 && arg <= 1000;
    }
}
