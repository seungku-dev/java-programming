public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Bird bird = new Bird("Bird") {
            @Override
            public void fly() {
                System.out.println(getName() + " is flying");
            }
        };

        bird.fly();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
    }
}