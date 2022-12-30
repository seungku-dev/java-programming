public class Expression {

    public static void main(String[] args) {
        // what parts are expressions?
        int highScore = 2000;
        // expression: highScore = 2000
        int health = 100;
        // expression: health = 100

        if ((health < 25) && (highScore > 1000)) {
        // expression: (health < 25) && (highScore>1000)
        // expression: (health < 25)
        // expression: (highScore>1000)
            highScore = highScore - 1000;
            // expression: highScore = highScore - 1000
            // expression: highScore - 1000
        }
    }
}
