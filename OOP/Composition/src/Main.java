public class Main {
    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.getRefrigerator().orderFood();
        smartKitchen.getCoffeeMaker().brewCoffee();
        smartKitchen.getDishWasher().doDishes();
        smartKitchen.doKitchenWork();
    }
}