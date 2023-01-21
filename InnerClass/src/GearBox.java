import java.util.ArrayList;

public class GearBox {

    private Stick stick;
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void addStick(double height) {
        this.stick = new Stick(height);
    }

    public void moveStick(Gear gear) {
        this.stick.moveStick(gear);
    }

    private class Stick {

        private double height;
        public Stick(double height) {
            this.height = height;
        }

        public void moveStick(Gear gear) {
            System.out.println(gear.driveSpeed(100));
        }
    }

    public class Gear {

        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}
