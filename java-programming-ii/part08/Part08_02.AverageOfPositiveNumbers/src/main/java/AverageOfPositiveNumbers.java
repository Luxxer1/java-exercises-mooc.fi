
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positiveNumbers = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                positiveNumbers.add(input);
            }
        }

        if (positiveNumbers.size() == 0) {
            System.out.println("Cannot calculate the average");
        }

        double average = 0;
        for (int number: positiveNumbers) {
            average += number;
        }

        System.out.println(average * 1.0 / positiveNumbers.size());
    }
}
