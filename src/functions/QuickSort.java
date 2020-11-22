package functions;

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int[] numbers = {6, 5, 4, 10, 0, 8, 3, 2, 1};

    quickSort2(numbers, 0, numbers.length - 1);
    System.out.println(Arrays.toString(numbers));
  }

  public static void quickSort2(int[] arr, int left, int right) {
    int l      = left;
    int r      = right;
    int middle = arr[(left + right) / 2];

    do {
      while (arr[l] < middle) l++;
      while (arr[r] > middle) r--;

      if (l <= r) {
        swap(arr, l, r);
        l++;
        r--;
      }
    } while (l <= r);

    if (left < r) quickSort2(arr, left, r);
    if (l < right) quickSort2(arr, l, right);
  }

  public static int[] quickSort(int[] arr, int left, int right) {
    if (left >= right) return arr;

    int l     = left;
    int r     = right;
    int pivot = left;

    while (left != right) {
      while (arr[right] >= arr[pivot] && left < right) right--;
      while (arr[left] < arr[pivot] && left < right) left++;

      swap(arr, left, right);
    }

    quickSort(arr, l, right - 1);
    quickSort(arr, left + 1, r);
    return arr;
  }

  public static void swap(int[] arr, int left, int right) {
    int temp = arr[right];
    arr[right] = arr[left];
    arr[left]  = temp;
  }
}
