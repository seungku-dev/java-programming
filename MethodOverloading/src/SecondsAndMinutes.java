public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 3945));
    }

    public static String getDurationString(int sec) {
        if (sec < 0) {
            return "Invalid argument";
        }

        return getDurationString(sec/60, sec%60);
    }

    public static String getDurationString(int min, int sec) {
        if (sec < 0 || min < 0) {
            return "Invalid argument";
        }

        int correctionMin = min + (sec/60);
        return correctionMin/60 + "h " + correctionMin%60 + "m " + sec%60 + "s";
    }
}
