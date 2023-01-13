public class Main {
    public static void main(String[] args) {
        printStringInfo("Hello world!");
        printStringInfo(""); // string.isEmpty == true
        printStringInfo(" "); // string.isBlank == true

        String helloWorld = "Hello world";
        System.out.printf("Index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("Index of l from 3 = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("Index of l from last = %d %n", helloWorld.lastIndexOf('r'));
    }

    public static void printStringInfo(String string) {
        int length = string.length();
        System.out.printf("length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is Blank");
            return;
        }

        System.out.printf("First char = %c %n", string.charAt(0));
    }
}