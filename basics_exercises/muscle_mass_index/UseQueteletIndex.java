import java.util.Scanner;

public class UseQueteletIndex
{
    public static void main( String... args )
    {
        Scanner scan = new Scanner( System.in );

        System.out.print( "Please enter your weight: " );
        var weight = scan.nextDouble();
        
        System.out.print( "Please enter your height: " );
        var height = scan.nextDouble();
        
        var queteletIndex = new QueteletIndex( weight, height );

        System.out.printf( 
                    "Your MMI = %1$.2f \nResult: %2$s", 
                    queteletIndex.mmi(),
                    queteletIndex.result() 
                );   
  
	scan.close();   
    }
}
