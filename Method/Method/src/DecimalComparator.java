public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int castedNum1 = (int)(num1*1000);
        int castedNum2 = (int)(num2*1000);

        return castedNum1 == castedNum2;
    }
}
