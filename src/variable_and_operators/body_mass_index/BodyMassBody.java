package variable_and_operators.body_mass_index;

import java.util.Scanner;

public class BodyMassBody {

    /*
        Construir un programa que dado el peso (en kilogramos) y la altura de
        una persona (en metros) calcule y muestre por pantalla su Indice de Masa
        Corporal (IMS) o índice de Quetelet. Este índice pretende determinar el
        intervalo de peso más saludable que puede tener una persona.
        BMI = weight / (height) ^ 2
     */

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
