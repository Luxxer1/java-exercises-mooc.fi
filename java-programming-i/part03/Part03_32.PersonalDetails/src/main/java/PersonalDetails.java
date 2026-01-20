
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumYears = 0, count = 0;
        String longestName = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splited = input.split(",");
            
            count += 1;
            sumYears += Integer.parseInt(splited[1]);
            
            if (splited[0].length() > longestName.length()) {
                longestName = splited[0];
            }
        }
        
        double averageYears = sumYears * 1.0 / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageYears);
    }
}
