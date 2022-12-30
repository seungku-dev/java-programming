public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour/1.609);
    }

    // This method prints a message "XX km/h = YY mi/h".
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long converted = toMilesPerHour(kilometersPerHour);
        // XX represents the original value kilometersPerHour.
        // YY represents the rounded milesPerHour from the kilometersPerHour parameter.
        System.out.println(kilometersPerHour + " km/h = " + converted + " mi/h");
    }
}
