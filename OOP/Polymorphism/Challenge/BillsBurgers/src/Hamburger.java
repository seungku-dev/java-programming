public class Hamburger {

    private double price;
    private String name;
    private String meat;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        System.out.printf("%s hamburger on a %s roll with %s, price is %.2f %n", name, breadRollType, meat, price);
    }

    private double addition1Price;

    private String addition1Name;

    private double addition2Price;
    private String addition2Name;

    private double addition3Price;
    private String addition3Name;

    private double addition4Price;
    private String addition4Name;

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price += price;
        System.out.printf("Added %s for an extra %.2f %n", addition1Name, addition1Price);
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price += price;
        System.out.printf("Added %s for an extra %.2f %n", addition2Name, addition2Price);
    }
    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price += price;
        System.out.printf("Added %s for an extra %.2f %n", addition3Name, addition3Price);
    }
    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price += price;
        System.out.printf("Added %s for an extra %.2f %n", addition4Name, addition4Price);
    }

    public double itemizeHamburger() {
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}

class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy hamburger", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price += price;
        System.out.printf("Added %s for an extra %.2f %n", healthyExtra1Name, healthyExtra1Price);
    }
    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price += price;
        System.out.printf("Added %s for an extra %.2f %n", healthyExtra1Name, healthyExtra1Price);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
    }
}

class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe hamburger", "Sausage & Bacon", 19.10, "White");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition1("Drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}