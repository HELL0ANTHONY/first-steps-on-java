public class BasicMathOperations
{
    public static void main( String... args )
    {
        int num1 = 12;
        int num2 = 4;
        System.out.printf( "num1: %d and num2: %d %n", num1, num2 );
        System.out.printf(
                "Sum: %1$d \nSubtraction: %2$d \nMultiplication: %3$d \nDivision: %4$d",
                num1 + num2,
                num1 - num2,
                num1 * num2,
                num1 / num2
                );
    }
}
