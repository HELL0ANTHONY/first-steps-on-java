package loops;

public class DiaryWithARegularFor {

   /*
        Definir un array bidimensional para representar una agenda semanal, donde
        se contemplen los 7 días de la semana y las 24 horas de cada día.
        Utilizar bucles for anidados para inicializar la agenda a: "No tengo
        planes.". Añadir "planes" a la agenda y mostrar el resultado por pantalla.
    */

    public static void main(String[] args) {
        String[][] diary = new String[7][25];

        diary[0][0] = "Sun";
        diary[1][0] = "Mon";
        diary[2][0] = "Tue";
        diary[3][0] = "Wed";
        diary[4][0] = "Thu";
        diary[5][0] = "Fri";
        diary[6][0] = "Sat";

        for (int row = 0; row < diary.length; row++)
            for (int column = 1; column < diary[row].length; column++)
                 diary[row][column] = "No tengo planes.";

        diary[0][9]  = "breakfast";
        diary[4][15] = "something";
        diary[6][6]  = "something again";

        for (int row = 0; row < diary.length; row++) {
            for (int column = 0; column < diary[row].length; column++)
                System.out.print(diary[row][column] + "\t");
            System.out.print("\n");
        }
    }
}
