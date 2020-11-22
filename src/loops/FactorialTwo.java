package loops;

public class FactorialTwo {

   /*
        Construir un programa que calcule el factorial de un valor
        numérico introducido como parámetro o argumento en la línea
        de comando;
    */

  public static void main(String[] args) {

    int userNumber = Integer.parseInt(args[0]);
    int factorial  = 1;

    for (int i = 1; i <= userNumber; i++)
         factorial = factorial * i;
    System.out.println(factorial);
  }
}
