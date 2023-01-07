public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack (1, 0, 4));
        System.out.println(canPack (1, 0, 5));
        System.out.println(canPack (0, 5, 4));
        System.out.println(canPack (2, 2, 11));
        System.out.println(canPack (-3, 2, 12));
        System.out.println(canPack (0, 5, 6));
        System.out.println(canPack (2, 7, 18));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int small;
        if (bigCount == 0) {
            small = goal;
        } else {
            int big = goal/5;
            if (bigCount >= big) {
                small = (goal - (big*5));
            } else {
                small = (goal - (bigCount*5));
            }
        }

        return (smallCount >= small);
    }
}
