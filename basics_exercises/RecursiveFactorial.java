public class RecursiveFactorial 
{
    public static void main( String[] args )
    {
            if ( isNumeric( args[0] ) ) 
                System.out.printf( "The factorial of %s is %d", args[0], factorial( Integer.parseInt( args[0] ) ) ); 
            else
                System.out.print( "The value is not a number" );
    }
    
    public static boolean isNumeric( String s )
    {
       try {
           Integer.parseInt( s );
           return true;
       } catch ( NumberFormatException ex ) {
           return false;
       } 
    }        

    public static int factorial( int num )
    {
        return ( num <= 1) ? 1 : num * factorial( num - 1 );
    }

}

   
