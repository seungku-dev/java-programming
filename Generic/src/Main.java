public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");

        Team<FootballPlayer> chelsea = new Team();
        chelsea.addPlayer(joe);
        System.out.println(chelsea.numPlayers());

        Team<BaseballPlayer> boston = new Team();
        boston.addPlayer(pat);
        System.out.println(boston.numPlayers());

        Team<FootballPlayer> manchester = new Team();
        manchester.addPlayer(new FootballPlayer("rooney"));
        manchester.addPlayer(new FootballPlayer("ji-sung"));
        System.out.println(manchester.numPlayers());

        chelsea.match(manchester, 1, 1);

//        Team<String> invalidTeam = new Team(); // String should not be allowed
//        invalidTeam.addPlayer(joe);
//        chelsea.match(boston, 1, 2); // chelsea.match function should accept FootballPlayer as parameter
    }
}