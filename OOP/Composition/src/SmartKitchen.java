public class SmartKitchen {

    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen() {
        this.refrigerator = new Refrigerator(true);
        this.dishWasher = new DishWasher(true);
        this.coffeeMaker = new CoffeeMaker(true);
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public void addWater() {
        refrigerator.orderFood();
    }

    public void pourMilk() {
        coffeeMaker.brewCoffee();
    }

    public void loadDishwasher() {
        dishWasher.doDishes();
    }

    public void doKitchenWork() {
        addWater();
        pourMilk();
        loadDishwasher();
    }
}
