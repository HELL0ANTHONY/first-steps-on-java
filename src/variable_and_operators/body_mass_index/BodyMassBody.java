package variable_and_operators.body_mass_index;

import java.util.Scanner;

public class BodyMassBody {
    public static void main(String[] args) {
        double height;
        double weight;
        double bmi;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your height: ");
        height = scan.nextDouble();
        System.out.print("Please enter your weight: ");
        weight = scan.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.printf("Your BMI is = %.2f", bmi);
        scan.close();
    }
}
