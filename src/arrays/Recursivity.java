package arrays;

public class Recursivity {
  public static void main(String[] args) {
//    oneToOneHundred(4, 100);
    System.out.println(sum(10));
  }

  public static int oneToOneHundred(int init, int goal) {
    if(init == goal) return init;
    System.out.println(init);
    return oneToOneHundred(init + 1, goal);
  }

  public static int sum(int number) {
    if (number == 0) return 0;
    return number + sum(number -1);
  }
}
