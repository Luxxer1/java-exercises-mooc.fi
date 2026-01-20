
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splited = input.split(",");
            if (Integer.parseInt(splited[1]) > oldest) {
                oldest = Integer.parseInt(splited[1]);
            }
        }

        System.out.println("Age of the oldest: " + oldest);
    }
}
