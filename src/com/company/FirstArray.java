import java.util.Scanner;

public class FirstArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getInt(5);
        for (int i=0; i<myIntegers.length; i++) {
            System.out.println(myIntegers[i]);
        }
        System.out.println(getAverage((myIntegers)));
    }

    public static int[] getInt (int number) {
        int[] array = new int[number];

        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static double getAverage(int[] array){
        int value = 0;
        for(int i=0; i<array.length; i++){
            value += array[i];
        }
        return (double) value / array.length;
    }
}
