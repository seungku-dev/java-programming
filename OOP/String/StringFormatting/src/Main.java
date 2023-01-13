public class Main {
    public static void main(String[] args) {

        String bulletList =
                "Print a Bulleted List:\n" +
                        "\t\u2022 First Point\n" +
                        "\t\t\u2022 Sub Point";
        System.out.println(bulletList);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point
                """;
        System.out.println(textBlock);

        int age = 100;
        String formattedString = String.format("My age is %d", age);
        System.out.println(formattedString);

        formattedString = "My age is %d".formatted(age);
        System.out.println(formattedString);
    }
}