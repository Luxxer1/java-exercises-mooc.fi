
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> inputs = new ArrayList<>();

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                break;
            }

            inputs.add(input);
        }

        int sum = 0;

        for (int input: inputs) {
            sum += input;
        }

        double average = sum * 1.0 / inputs.size();

        System.out.println("Average: " + average);
        
    }
}
