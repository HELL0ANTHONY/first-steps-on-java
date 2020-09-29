package condicionals.the_biggest.body_mass_index;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.print("Please introduce your weight: ");
        var weight = scan.nextDouble();
        System.out.print("Please introdoce your height: ");
        var height = scan.nextDouble();

        double bmi = bodyMassIndex(weight, height);
        System.out.println(bmi);
        personsCondition(bmi);
    }

    public static double bodyMassIndex(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

    public static void personsCondition(double bmi) {
        if (bmi < 16)
            System.out.println("Consult the doctor");
        else if ((bmi == 16) || (bmi == 17))
            System.out.println("Your weight is too low");
        else if (bmi == 18)
            System.out.println("You need to gain weight");
        else if ((bmi > 18) && (bmi <= 25))
            System.out.println("Normal");
        else if ((bmi > 25) && (bmi <= 30))
            System.out.println("Overweight");
        else if ((bmi > 30) && (bmi <= 35))
            System.out.println("Chronic overweight");
        else if ((bmi > 35) && (bmi <= 40))
            System.out.println("Premorbid Obesity");
        else
            System.out.println("Morbid Obesity");
    }
}
