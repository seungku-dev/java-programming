public class StringMethod {

    public static void main(String[] args) {

        String birthDate = "23/12/1987";
        int startIndex = birthDate.indexOf("1987");
        System.out.println("startingIndex = " + startIndex);
        System.out.println("Birth year = " + birthDate.substring(startIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "1987", "12", "23");
        System.out.println(newDate);

        newDate = "23".concat("/").concat("12").concat("/").concat("1987");
        System.out.println(newDate);

        newDate = "23" + "/" + "12" + "/" + "1987";
        System.out.println(newDate);

        System.out.println(newDate.replace("/", "-"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(4));
        System.out.println("-".repeat(20));
    }
}
