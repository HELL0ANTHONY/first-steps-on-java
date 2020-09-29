package loops;

public class FahrenheitToCelsius {

   /*
        Construir un programa en el que, utilizando un bucle for, se escriba
        por pantalla una tabla de conversión de grados Fahrenheit a Celsius, para
        los valores de 0 a 300 grados, en intervalos de 20;
    */
    public static void main(String[] args) {

        for (int f = 0; f <= 300; f += 20) {
            System.out.printf("%d °F = %.2f °C %n", f, (5.0 / 9.0) * (f - 32));
        }
    }
}
