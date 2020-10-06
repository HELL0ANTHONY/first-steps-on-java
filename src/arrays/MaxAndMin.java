package arrays;

import java.util.Scanner;

public class MaxAndMin {
    /*
        Construir un programa que pida al usuario una serie de números enteros,
       los almacene en un array, y obtenga el máximo y el mínimo de los valores
        almacenados.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many elements do you want to store?: ");
        int arrayLength = scan.nextInt();

        int[] stored = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Please enter the element number " + (i + 1) + ": ");
            stored[i] = scan.nextInt();
        }

        System.out.printf(
                "%nThe maximum is %1$d %nAnd the minimum is %2$d",
                max(stored, arrayLength),
                min(stored, arrayLength)
        );
        scan.close();
    }

    public static int max(int[] arr, int arrLength) {
        int maximum = arr[0];
        for (int i = 0; i < arrLength; i++)
            if (arr[i] > maximum)
                maximum = arr[i];

        return maximum;
    }

    public static int min(int[] arr, int arrLength) {
        int minimum = arr[0];
        for (int i = 0; i < arrLength; i++)
            if (arr[i] < minimum)
                minimum = arr[i];

        return minimum;
    }
}
