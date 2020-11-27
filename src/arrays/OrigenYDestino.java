package arrays;

public class OrigenYDestino {
  /*
      Teniendo un vector con los valores que queramos, meter un otro de la misma
      longitud, aquellos que sean pares y mayores que 25.
      Después mostrar el vector de origen y el de destino, solo los números
      introducidos.
   */
  public static void main(String[] args) {
    int[]     origin  = new int[100];
    final int MIN     = 0;
    final int MAX     = 100;
    final int INDEX   = origin.length - 1;
    int[]     destiny = new int[INDEX];
    origin  = aleatoryNumbers(MIN, MAX, INDEX);
    destiny = copy(origin, INDEX);

    System.out.print("Origin: ");
    for (int i : origin)
      System.out.printf("%d ", i);

    System.out.print("\nDestiny: ");
    for (int i = 0; i < destiny.length; i++)
      if (destiny[i] > 0)
        System.out.print(" " + destiny[i]);
  }
    public static int[] copy ( int[] arr, int index){
      int   count   = 0;
      int[] numbers = new int[index];

      for (int i = 0; i < index; i++)
        if (arr[i] > 25 && arr[i] % 2 == 0)
          numbers[count++] = arr[i];

      return numbers;
    }

    public static int aleatory ( int min, int max){
      return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static int[] aleatoryNumbers ( int min, int max, int index){
      int[]   numbers = new int[index];
      int     j       = 0;
      int     aleatory;
      boolean exists;
      while (j < index) {
        aleatory = aleatory(min, max);
        exists   = false;
        for (int i = 0; i < index && !exists; i++)
          if (aleatory == numbers[i])
            exists = true;
        if (!exists) numbers[j++] = aleatory;
      }
      return numbers;
    }

  }
