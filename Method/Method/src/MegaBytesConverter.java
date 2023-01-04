public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int killoBytes) {
    // This method prints a message "XX KB = YY MB and ZZ KB".
        if (killoBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int mBytes = killoBytes / 1024;
        int kBytes = killoBytes % 1024;
        System.out.println(killoBytes + " KB = " + mBytes + " MB and " + kBytes + " KB");
    }

}
