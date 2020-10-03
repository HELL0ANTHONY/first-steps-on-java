package loops;

public class ANSICharacters {
    /*
          Construir un programa que visualice por pantalla todos los caracteres
           correspondientes a letras minúsculas.
     */
    public static void main(String[] args) {
        var a = (int) 'a';
        var z = (int) 'z';

        for (int i = a; i <= z; i++)
             System.out.print((char) i);
    }
}
