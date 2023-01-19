public class Main {
    public static void main(String[] args) {

        String[] textList = {"Hello ", "World ", "!"};
        printText(textList);
        printText("Nice", " to", " meet", " you!");
    }

    public static void printText(String... textList) {

        for (var text : textList) {
            System.out.print(text);
        }
        System.out.println();
    }
}