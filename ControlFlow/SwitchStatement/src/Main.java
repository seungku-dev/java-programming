public class Main {
    public static void main(String[] args) {

        enum Event {
            PLAY, PAUSE, STOP
        }

        Event event = Event.PLAY;

        // latest switch statement style in JDK 12
        // switch can be an expression
        // Using 'yield' instead of 'return' only in the code block
        String log = switch (event) {
            case PLAY -> "User has triggered the play button";
            case STOP -> "User needs a break";
            default -> "No event to log";
        };

        System.out.println(log);
    }
}