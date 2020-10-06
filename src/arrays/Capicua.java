package arrays;

import java.util.Scanner;

public class Capicua {
    /*
         Construir un programa que pida al usuario una serie de números enteros,
         los almacene en un array, e indique en pantalla si dicho array es capicúa,
         es decir, si la secuencia de sus elementos es igual vista de delante hacia
         atrás y de detrás hacia delante.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many number do you want to store: ");
        var arrayLength = scan.nextInt();

        var arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Please enter the number: ");
            arr[i] = scan.nextInt();
        }
        scan.close();

        if(isCapicua(arr, reverse(arr)))
            System.out.println("Is capicua");
        else
            System.out.println("Is not capicua");
    }

    public static int[] reverse(int[] arr) {
        var aux = new int[arr.length];
        for(int i = (arr.length - 1), j = 0; i >= 0; i--, j++)
            aux[j] = arr[i];
        return aux;
    }

    public static boolean isCapicua(int[] arr, int[] reverse) {
        for(int i = 0; i < arr.length; i++)
           if (arr[i] != reverse[i]) return false;
        return true;
    }
}
