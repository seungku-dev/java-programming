public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int num1, int num2) {

        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99))
            return false;

        boolean result = false;
        while (num1 != 0) {

            int digit = num1 % 10;
            int copiedNum2 = num2;
            while (copiedNum2 != 0) {
                int digit2 = copiedNum2 % 10;
                if (digit == digit2) {
                    result = true;
                    break;
                }
                copiedNum2 /= 10;
            }
            num1 /= 10;
        }

        return result;
    }
}
