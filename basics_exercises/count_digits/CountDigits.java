public class CountDigits
{  
    public static void main( String... args )
    {
        System.out.printf( "The number %s contains %d digit (s)", args[0], countDigits( Integer.parseInt( args[0] ) ) ); 
    }

    public static int countDigits( int number ) 
    {
        int count = 1;
        for ( int i = number; i >= 10; i /= 10 )
            count++;
        return count;
    }
}

