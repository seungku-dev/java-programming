public class HomeAppliance {

    protected boolean hasWorkToDo;

    public HomeAppliance(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class Refrigerator extends HomeAppliance {

    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("orderFood");
            hasWorkToDo = false;
        }
    }
}

class DishWasher extends HomeAppliance {

    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("doDishes");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker extends HomeAppliance {

    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("brewCoffee");
            hasWorkToDo = false;
        }
    }
}
