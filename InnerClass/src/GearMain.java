public class GearMain {
    public static void main(String[] args) {

        GearBox mcLaren = new GearBox(6);
        GearBox.Gear first = mcLaren.new Gear(1, 12.3);

        // Stick is private inner class
        //GearBox.Stick stick = mcLaren.new Stick(10.0);
        mcLaren.addStick(10.5);
        mcLaren.moveStick(first);
        // Invalid grammar
        // GearBox.Gear second = new mcLaren.Gear(2, 15.4);
        // GearBox.Gear second = new GearBox.Gear(2, 15.4);
        //System.out.println(first.driveSpeed(1000));
    }
}