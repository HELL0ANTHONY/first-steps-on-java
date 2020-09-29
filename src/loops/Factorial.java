package loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        var number = scan.nextInt();

        System.out.println("Factorial = " + factorial(number));
        scan.close();
    }

    public static int factorial(int number) {
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }
}
