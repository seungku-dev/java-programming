import java.util.ArrayList;
import java.util.List;

public class Team<T extends  Player> {

    private int won;
    private int lost;
    private int tied;

    List players = new ArrayList<T>();

    public void addPlayer(T player) {
        players.add(player);
        System.out.println(player.getName() + " has joined the team.");
    }

    public int numPlayers() {
        return players.size();
    }

    public void match(Team<T> opponent, int ourScore, int opponentScore) {
        if (ourScore > opponentScore) {
            won++;
            System.out.println("win");
        } else if (ourScore < opponentScore) {
            lost++;
            System.out.println("lose");
        } else {
            tied++;
            System.out.println("draw");
        }
    }
}
