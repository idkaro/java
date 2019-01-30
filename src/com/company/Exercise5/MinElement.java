package Exercise5;
import java.util.Scanner;

public class MinElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readintegers(count);

        int minNumber = findMin(returnedArray);

        System.out.println("min number was " + minNumber);
    }

    public static int[] readintegers(int count) {
        int[] array = new int[count];

        for (int i=0; i<array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
