package the_biggest;

import java.util.Scanner;

public class TheBiggest {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.print("Introduce the first number: ");
        int num_1 = scan.nextInt();
        System.out.print("Introduce the second number: ");
        int num_2 = scan.nextInt();

        whoIsTheBiggest(num_1, num_2);
        scan.close();
    }

    public static void whoIsTheBiggest(int number_1, int number_2) {
        if (number_1 > number_2)
            System.out.println("The " + number_1 + " is the biggest");
        else if (number_1 < number_2)
            System.out.println("The " + number_2 + " is the biggest");
        else
            System.out.println("The numbers are the same");
    }
}
