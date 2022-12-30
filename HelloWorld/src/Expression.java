public class Expression {

    public static void main(String[] args) {
        // what parts are expressions?
        int highScore = 2000;
        // highScore = 2000
        int health = 100;
        // health = 100

        if ((health < 25) && (highScore > 1000)) {
        // (health < 25) && (highScore>1000)
        // (health < 25)
        // (highScore>1000)
            highScore = highScore - 1000;
            // highScore = highScore - 1000
            // highScore - 1000
        }
    }
}
