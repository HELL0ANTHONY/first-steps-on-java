package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    /*
       Construir un programa que pida al usuario dos vectores de números enteros
       v1 y v2, y que construya un nuevo vector v que almacene la suma de ambos
       vectores. El nuevo vector se ha de ajustar al vector más largo proporcionado
      por el usuario. Finalmente, mostrar el resultado por pantalla.

        Por ejemplo, la suma de los vectores
        [1, 2, 3] y [1, 2, 3, 4, 5] es [2, 4, 6, 4, 5]
     */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the length to the first array: ");
    int arr1Length = scan.nextInt();
    System.out.print("Enter the length to the second array: ");
    int arr2Length = scan.nextInt();

    int[] arr1 = new int[arr1Length];
    int[] arr2 = new int[arr2Length];

    System.out.println("Enter the elements to the first array");
    for (int i = 0; i < arr1Length; i++) {
      System.out.print("Enter the element to the position " + (i + 1) + ": ");
      arr1[i] = scan.nextInt();
    }

    System.out.println("\nNow enter the element to the second array");
    for (int i = 0; i < arr2Length; i++) {
      System.out.print("Enter the element to the position " + (i + 1) + ": ");
      arr2[i] = scan.nextInt();
    }

    System.out.println("The result " + Arrays.toString(sumArrays(arr1, arr2)));
    scan.close();
  }

  public static int[] sumArrays(int[] a, int[] b) {
    int   max = Math.max(a.length, b.length);
    int[] c   = new int[max];
    for (int i = 0; i < max; i++) {
      if (i < a.length && i < b.length)
        c[i] = a[i] + b[i];
      else if (i >= a.length)
        c[i] = b[i];
      else if (i >= b.length)
        c[i] = a[i];
    }
    return c;
  }
}
