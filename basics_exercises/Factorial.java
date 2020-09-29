import java.util.Scanner;

public class Factorial
{
    public static void main( String... args )
    {
        Scanner scan = new Scanner( System.in );
        System.out.print( "Please enter a number: " );
        int number = scan.nextInt();

        System.out.printf( 
                "The factorial of %d id equal to %d", number, factorial( number ) );
    }     
    public static int factorial( int number )
    {
        int factorial = 1;
        if ( number <= 1 ) return 1;
        for ( int i = 2; i <= number; i++ )
              factorial *= i;
       return factorial; 
    }
  

}
