
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ----------------------------------- //
        int sum = 0;
        int inputs = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.next());

            if (number == -1) {
                break;
            }

            sum += number;
            inputs += 1;
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + inputs);
        System.out.println("Average: " + ((1.0 * sum) / inputs));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
