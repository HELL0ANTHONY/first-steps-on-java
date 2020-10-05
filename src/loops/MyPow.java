package loops;

import java.util.Scanner;

public class MyPow {

   /*
    Construir un programa en el que se pida al usuario dos números enteros
    positivos, n y m, y usando un bucle for, escriba el valor de n elevado a m.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int n = scan.nextInt();
        System.out.print("Please enter the second number: ");
        int m = scan.nextInt();

        int power = 1;
        for (int i = 1; i <= m; i++) power *= n;

        System.out.printf("%1$d ^ %2$d = %3$d", n, m, power);
        scan.close();
    }


}
