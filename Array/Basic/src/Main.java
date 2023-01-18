import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = {1,2,3,4,5};

        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }

        System.out.println("-".repeat(10));

        myIntArray = new int[] {5,4,3,2,1,0};
        for (var element : myIntArray) {
            System.out.println(element);
        }

        System.out.println("-".repeat(10));

        System.out.println(Arrays.toString(myIntArray));
        Object objectVar = myIntArray;
        if (objectVar instanceof int[]) {
            System.out.println("objectVar is an int array");
        }
    }
}