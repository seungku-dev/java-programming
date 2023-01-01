public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        // year: greater than or equal to 1 and less than or equal to 9999.
        if (year < 1 || year > 9999) {
            return false;
        }

        // step 1
        if ((year%4) == 0) {
            // step 2
            if ((year%100) == 0) {
                // step 3
                // step 4
                // step 5
                return (year % 400) == 0;
            } else {
                // step 4
                return true;
            }
        } else {
            // step 5
            return false;
        }
    }
}
