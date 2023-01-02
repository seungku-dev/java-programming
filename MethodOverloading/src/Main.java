public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5,8));

    }

    public static double convertToCentimeters(int inches) {

        //This method convert inches to centimeters
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

        // This method convert feet and inches to inches
        // Then, call the first method to convert centimeters
        return convertToCentimeters((feet * 12) + inches);
    }
}