package functions;

import java.util.Arrays;

public class ShowDividers {
    /*
        Crear una función que tome como parámetro un número y devuelve un array
        con el número de divisores primos que tiene. Recomendación: crear una
        nueva función o utilizar la anterior que indique si un número es primo o no.
     */

    public static void main(String[] args) {
        for (int i = 0; i <= 101; i++)
             answer(i);
    }

    public static void answer(int n) {
        if (isPrime(n))
            System.out.println(Arrays.toString(primeNumberDividers(n)));
        else
            System.out.println(n + " It is not a prime number");
    }

    public static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n < 2 || (n % 2 == 0)) return false;
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] primeNumberDividers(int n) {
        return new int[] {1, n};
    }
}
