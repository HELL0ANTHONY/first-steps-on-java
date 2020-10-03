package loops;

public class Fibonacci {

   /*
   Implementar un programa en el que, utilizando un bucle while, se escriban por
   pantalla los 51 primeros números de la sucesión de Fibonacci, definida por
   recurrencia como sigue:
    f0 = 0
    f1 = 1
    fn+2 = fn+1 + fn
    */

    public static void main(String[] args) {
        int f0 = 0;
        int f1 = 1;
        int fibonacci;
        int i  = 0;

        while (true) {
            if (i == 51) break;
            System.out.println(fibonacci = f0 + f1);
            f0 = f1;
            f1 = fibonacci;
            i++;
        }
    }
}
