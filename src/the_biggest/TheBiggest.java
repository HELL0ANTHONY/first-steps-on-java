package the_biggest;

public class TheBiggest {

   /*
        Definir dos variables num_1 y num_2 e implementar un
        programa un programa que asigne un valor a cada una, y
        obtenga el mayor de los dos, mostrando el resultado en
        pantalla;
    */

    public static void main(String[] args) {
        int num_1 = Integer.parseInt(args[0]);
        int num_2 = Integer.parseInt(args[1]);

        whoIsTheBiggest(num_1, num_2);
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
