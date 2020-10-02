package variable_and_operators.volume_and_area_of_a_sphere;

import java.util.Scanner;

public class Volume_and_Area {

   /*
        Construir un programa que, dado el radio de una esfera, calcule y devuelva
        por pantalla el valor de la superficie y el volumen de la esfera
         correspondiente. Para obtener el valor de PI, utilizar la variable
         estática Math.PI.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the radio: ");
        double radio = scan.nextDouble();

        double volume = (4 * Math.PI * Math.pow(radio, 3)) / 3;
        double area   = 4 * Math.PI * Math.pow(radio, 2);

        System.out.printf("Volume = %1$.2f %nArea = %2$.2f", volume, area);
        scan.close();
    }
}
