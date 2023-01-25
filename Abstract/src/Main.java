public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Parrot");
        parrot.fly();

        Penguin penguin = new Penguin("Penguin");
        penguin.fly();
    }
}