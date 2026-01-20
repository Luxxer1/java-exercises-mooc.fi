
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageOldest = 0;
        String nameOldest = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splited = input.split(",");
            if (Integer.parseInt(splited[1]) > ageOldest) {
                ageOldest = Integer.parseInt(splited[1]);
                nameOldest = splited[0];
            }
        }

        System.out.println("Name of the oldest: " + nameOldest);
    }
}
