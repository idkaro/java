package Exercise4;

import java.util.Scanner;

public class ex4 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public void readIntegers(int count) {
        getInt(count);
    }

    public static int[] getInt (int number) {
        int[] array = new int[number];

        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
