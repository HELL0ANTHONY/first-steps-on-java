package variable_and_operators.exercise_one;

public class Basic_One {
    public static void main(String... args) {
        int number_one = 89;
        int number_two = number_one;
        System.out.println("number_one = " + number_one);
        System.out.println("number_two = " + number_two);

        number_two = 100;
        System.out.println("current number_one value = " + number_one);
        System.out.println("current number_two value = " + number_two);
    }
}
