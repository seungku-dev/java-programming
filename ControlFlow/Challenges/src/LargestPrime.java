public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(16));
    }

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        int lagestPrime = 0;
        int prime = number;

        while (prime > 1) {
            for (int i = 2; i <= prime; i++) {
                if (prime % i == 0) {
                    if (i > lagestPrime) {
                        lagestPrime = i;
                    }
                    prime /= i;
                    break;
                } else {
                    continue;
                }
            }
        }

        return lagestPrime;
    }
}
