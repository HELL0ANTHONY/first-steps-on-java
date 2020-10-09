package functions;

public class TheBiggest {
    /*
        Crear una función que tome dos parámetros numéricos y calcule el máximo
        de los dos números. Crear una nueva función con el mismo nombre, que tome
        tres parámetros, y calcule el máximo de los tres números. Esta segunda
        función debe hacer uso de la primera.
     */

    public static void main(String[] args) {
        int firstNumber  = 100;
        int secondNumber = 78;
        System.out.printf(
                "The biggest is %d",
                theBiggest(firstNumber, secondNumber)
        );

        int thirdNumber = 89;
        System.out.printf(
                "%nThe largest of the three numbers is %d",
                theBiggest(firstNumber, secondNumber, thirdNumber)
        );
    }

    public static int theBiggest(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static int theBiggest(int num1, int num2, int num3) {
        int max = theBiggest(num1, num2);
        return (max > num3) ? max : num3;
    }
}
