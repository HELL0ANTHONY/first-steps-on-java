package functions;

public class PrimeNumber {
    /*
        Crear una función que tome como parámetro un número e indique si es primo
        o no.
     */

    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        int c = 6;
        int d = 8;

        printAnswer(isPrime(a));
        printAnswer(isPrime(b));
        printAnswer(isPrime(c));
        printAnswer(isPrime(d));
    }

    public static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n == 1 || n % 2 == 0) return false;
        for (int i = 3; i <= (int) Math.sqrt(n); i++, i++) {
            if (n % i == 0) {
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
