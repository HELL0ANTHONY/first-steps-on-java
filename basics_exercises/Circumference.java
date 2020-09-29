import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circumference
{
    public static void main( String... args )
    {
        Scanner scan = new Scanner( System.in );
        String radio = null;
        boolean isANumber = false; 
        do
        {
            System.out.print( "Please enter the radio: " );
            radio = scan.nextLine();
            isANumber = isNumeric( radio );
        } while( !isANumber );
       
        double r = Double.parseDouble( radio );
        double volume = ( 4 * PI * pow( r, 3 ) ) / 3;
        double area = PI * pow( r, 2 );

        System.out.printf( "The area = %1$.2f and the volume = %2$.2f", area, volume );
        scan.close();
        

    }
    
    public static boolean isNumeric( String s )
    {
        try 
        {
            Double.parseDouble( s );
            return true;
        }
        catch( NumberFormatException ex )
        {
            return false;
        }
    }
}   



