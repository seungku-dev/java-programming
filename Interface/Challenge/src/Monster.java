import java.util.List;
import java.util.Vector;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> list = new Vector<>();
        list.add(name);
        list.add(String.valueOf(hitPoints));
        list.add(String.valueOf(strength));

        return list;
    }

    @Override
    public void read(List<String> list) {
        if (list == null || list.size() < 1) {
            return;
        }

        this.name = list.get(0);
        this.hitPoints = Integer.parseInt(list.get(1));
        this.strength = Integer.parseInt(list.get(2));
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}
