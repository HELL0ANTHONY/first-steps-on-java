package loops;

import java.util.Scanner;

public class MagicNumber {
   /*
        Construir un programa que simule el juego de la adivinanza de un número.
        El ordenador debe generar un número aleatorio entre 1 y 100 y el usuario
        tiene cinco oportunidades para acertarlo. Después de cada intento el
        programa debe indicarle al usuario si el número introducido por él es
        mayor, menor o igual al número a adivinar, y el número de intentos restantes.
    */

    public static void main(String[] args) {
        var scan        = new Scanner(System.in);
        var magicNumber = (int) (100 * Math.random() + 1);
        var userNumber  = 0;
        var chance      = 0;

        while ((chance < 5) && (magicNumber != userNumber)) {
            System.out.printf("You have %d opportunities %n", (5 - chance));
            chance++;

            System.out.print("Please, enter a number: ");
            userNumber = scan.nextInt();

            if (userNumber < magicNumber)
                System.out.println("Higher");
            else if (userNumber > magicNumber)
                System.out.println("Lower");
        }

        if (chance < 5)
            System.out.println("Congratulations you guessed it");
        else
            System.out.println("Sorry, you lost");

        scan.close();
    }
}
