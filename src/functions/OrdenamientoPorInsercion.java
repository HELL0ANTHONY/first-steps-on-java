package functions;

import java.util.Arrays;

public class OrdenamientoPorInsercion {
  public static void main(String[] args) {
    int[] numeros = {5, 2, 8, 10, 4, 0, 1};
    ordenamientoPorInsercion(numeros);
    System.out.printf("Ordenamiento por inserción: %1$s", Arrays.toString(numeros));
  }

  public static void ordenamientoPorInsercion(int[] arr) {
    int aux;
    for (int i = 1; i < arr.length; i++) {
      aux = arr[i];
      for (int j = (i - 1); j >= 0 && arr[j] > aux; j--) {
        arr[j + 1] = arr[j];
        arr[j]     = aux;
      }
    }
  }
}
