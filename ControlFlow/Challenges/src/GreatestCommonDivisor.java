public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15)); // should return 5
        System.out.println(getGreatestCommonDivisor(12, 30)); // should return 6
        System.out.println(getGreatestCommonDivisor(9, 18)); // should return -1
        System.out.println(getGreatestCommonDivisor(81, 153)); // should return 9
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int gcd = 0;
        for (int i=2; i <= second; i++) {
            if ((first%i==0)&&(second%i==0)) {
                gcd = i;
            }
        }

        return gcd;
    }
}
