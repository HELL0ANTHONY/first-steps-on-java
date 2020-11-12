package arrays;

import java.util.Scanner;

public class ConcatenateArrays {
    /*
        Construir un programa que pida al usuario dos vectores de números enteros
        v1 y v2, y que construya un nuevo vector del resultado de "concatenar"
        los vectores v1 y v2. Es decir, colocar los elementos de v2 a continuación
        de los de v1 y, finalmente, mostrar el resultado de la concatenación por
        pantalla.
     */

    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.print("How many elements do you want to store in each array: ");
        var arrayLength = scan.nextInt();

        var arr1 = new int[arrayLength];
        var arr2 = new int[arrayLength];

        System.out.println("\nPlease, enter the elements to the first array");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Element to the position " + (i + 1) + ": ");
            arr1[i] = scan.nextInt();
        }

        System.out.println("Now for the second array");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Element to the position " + (i + 1) + ": ");
            arr2[i] = scan.nextInt();
        }

        for (int number : concatenate(arr1, arr2))
            System.out.print(number + " - ");
        scan.close();
    }

    public static int[] concatenate(int[] arr1, int[] arr2) {
        var concatenated   = new int[arr1.length * 2];
        var position = 0;
        for (int element : arr1) {
            concatenated[position] = element;
            position++;
        }
        for (int element : arr2) {
            concatenated[position] = element;
            position++;
        }
        return concatenated;
    }
}
