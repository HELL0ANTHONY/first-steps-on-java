package loops;

import java.util.Scanner;

public class FactorialTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce a number: ");
        int number = scan.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++)
           factorial = factorial * i;
        System.out.println(factorial);
        scan.close();
    }
}
