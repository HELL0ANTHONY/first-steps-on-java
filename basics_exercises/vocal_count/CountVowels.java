import java.util.Scanner;

public class CountVowels
{
    public static void main( String... args )
    {
        Scanner scan = new Scanner( System.in );
        System.out.print( "Please enter word or phrase!: " );
        String userString = scan.nextLine();

        System.out.printf( "The text contains %s vowel(s)", vowel( userString ) ); 
    }

    public static int vowel( String s )
    {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        final int stringLength = s.length();
        final int vowelsLength = vowels.length;
        int countVowels = 0;
        boolean isVowel; 
        char currentVowel;

        for ( int i = 0; i < stringLength; i++ )
        {
            currentVowel = Character.toLowerCase( s.charAt(i) );
            isVowel = false;
            for ( int j = 0; j < vowelsLength && !isVowel; j++ )
                if( currentVowel == vowels[j] )
                    isVowel = true;
            
           if ( isVowel )
                countVowels++;
        }
        return countVowels;
    }
}
