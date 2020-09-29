public class CopyVariable 
{
        public static void main( String... args )
        {
            int firstVariable = 10;
            int secondVariable = firstVariable;
            System.out.printf( 
                    "The first variable: %1$d and the second variable: %2$d %n",
                    firstVariable,
                    secondVariable
                    );
            secondVariable = 10 * 2;
            System.out.printf( 
                    "And now the second variable is %d and the first still is: %d", 
                    secondVariable,
                    firstVariable 
                    );
        }
}

