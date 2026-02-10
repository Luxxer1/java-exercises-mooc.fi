import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            inputs.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();

        System.out.println("Average of the positive numbers: " + getAverage(inputs, choice));
    }

    public static double getAverage(List<String> inputs, String choice) {
        IntStream stream = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s));

        switch (choice) {
            case "n":
                stream = stream.filter(number -> number < 0);
                break;

            case "p":
                stream = stream.filter(number -> number >= 0);
                break;
        }

        return stream.average().getAsDouble();
    }
}
