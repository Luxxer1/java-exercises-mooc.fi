
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeStatistics statistics = new GradeStatistics();

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int pointsInput = Integer.valueOf(scanner.nextLine());

            if (pointsInput == -1) {
                break;
            }

            if (pointsInput >= 0 && pointsInput <= 100) {
                statistics.add(pointsInput);
            }
        }

        GradeDistribution distribution = new GradeDistribution(statistics.getPoints());

        System.out.println(statistics);
        System.out.println(distribution);
    }
}
