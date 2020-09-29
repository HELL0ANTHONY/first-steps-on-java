package calculator;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.println("A = sum \nS = subtract \nD = divide \nM = multiplication");
        System.out.print("What operation do you want to do?: ");
        String operation = scan.nextLine().toUpperCase();
        System.out.print("Enter the first number: ");
        var number_1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        var number_2 = scan.nextDouble();

        System.out.printf("Result: %.2f", calculator(operation, number_1, number_2));
    }

    public static double calculator(String s, double number_1, double number_2) {
        switch (s) {
            case "A":
                return number_1 + number_2;
            case "S":
                return number_1 - number_2;
            case "D":
                return number_1 / number_2;
            case "M":
                return number_1 * number_2;
            default:
                return 0;
        }
    }
}
