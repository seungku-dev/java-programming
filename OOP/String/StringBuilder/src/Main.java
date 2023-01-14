public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String helloWorld = "Hello" + " world";
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");

        printString(helloWorld);
        printString(helloWorldBuilder);

        helloWorld.concat("and good bye");
        helloWorldBuilder.append("and good bye");

        printString(helloWorld);
        printString(helloWorldBuilder);

        StringBuilder empty = new StringBuilder(); // default capacity is 16
        // if appended String size is over than 16,
        // StringBuilder increase 16*N
        empty.append("a".repeat(17));
        StringBuilder empty32 = new StringBuilder(32);
        empty32.append("a".repeat(17));

        printString(empty);
        printString(empty32);
    }

    public static void printString(String string) {
        System.out.println("length: " + string.length());
        System.out.println(string);
        System.out.println("-".repeat(20));
    }

    public static void printString(StringBuilder builder) {
        System.out.println("capacity: " + builder.capacity());
        System.out.println("length: " + builder.length());
        System.out.println(builder);
        System.out.println("-".repeat(20));
    }
}