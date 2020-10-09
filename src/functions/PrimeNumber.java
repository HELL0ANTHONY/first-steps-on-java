package functions;

public class PrimeNumber {
    /*
        Crear una función que tome como parámetro un número e indique si es primo
        o no.
     */

    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        int c = 1;

        printAnswer(isPrime(a));
        printAnswer(isPrime(b));
        printAnswer(isPrime(c));
    }

    public static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n == 1) return false;
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printAnswer(boolean b) {
        if (b)
            System.out.println("Is a prime number");
        else
            System.out.println("It is not a prime number");
    }
}
