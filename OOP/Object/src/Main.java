public class Main extends java.lang.Object {
    public static void main(String[] args) {
        Student max = new Student("max", 21);
        System.out.println(max);

        PrimaryShoolStudent jimmy = new PrimaryShoolStudent("jimmy", 8, "Carole");
        System.out.println(jimmy);
    }
}

class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}

class PrimaryShoolStudent extends Student {

    private String parentName;

    PrimaryShoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}