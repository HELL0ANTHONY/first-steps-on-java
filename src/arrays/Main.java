package arrays;

public class Main {
  public static void main(String[] args) {
    int[] numbers           = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    var   searcher          = new BinarySearch();
    var   recursiveSearcher = new RecursiveBinarySearch();
    var   left              = 0;
    var   right             = numbers.length - 1;
    var searcherNumber = Integer.parseInt(
        javax.swing.JOptionPane.showInputDialog("Enter the number to find")
    );
    System.out.printf(
        "Found in position: %1$d%n",
        searcher.binarySearch(numbers, searcherNumber)
    );
    System.out.println(
        recursiveSearcher.rBS(numbers, left, right, searcherNumber)
    );
  }
}

class BinarySearch {
  public int binarySearch(int[] array, int target) {
    int left  = 0;
    int right = (array.length - 1);
    int middle;

    while (left <= right) {
      middle = (left + right) / 2;
      if (target == array[middle]) return middle;
      if (target < array[middle])
        right = middle - 1;
      else
        left = middle + 1;
    }
    return -1;
  }
}

class RecursiveBinarySearch {
  public int rBS(int[] array, int left, int right, int target) {
    if (left <= right) {
      int middle = (left + right) / 2;

      if (target == array[middle]) return middle;
      if (target < array[middle])
        return rBS(array, left, middle - 1, target);
      return rBS(array, middle + 1, right, target);
    }
    return -1;
  }
}