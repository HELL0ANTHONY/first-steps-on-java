package variable_and_operators.exercise_two;

public class ExerciseTwo {
    public static void main(String[] args) {
        int num_1          = 12;
        int num_2          = 4;
        int subtraction    = num_1 - num_2;
        int sum            = num_1 + num_2;
        int divide         = num_1 / num_2;
        int multiplication = num_1 * num_2;

        System.out.printf(
                "Sum = %1$d %nSubtraction = %2$d" +
                " %nDivide = %3$d %nMultiplication = %4$d",
                sum, subtraction, divide, multiplication
        );
    }
}
