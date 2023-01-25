public abstract class Bird extends Animal implements Winged {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathe");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
