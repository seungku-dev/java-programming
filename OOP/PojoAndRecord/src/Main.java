public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            PojoStudent student = new PojoStudent("ID" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Time";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "13/01/1999", "java");
            System.out.println(student);
        }

        PojoStudent p = new PojoStudent("123", "SK", "2000", "cpp");
        RecordStudent r = new RecordStudent("456", "JK", "java");

        System.out.println(p.getName() + " " +  p.getClassList());
        System.out.println(r.name() + " " +  r.classList());
    }
}