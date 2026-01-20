
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println((int) Math.pow(Integer.valueOf(scanner.nextLine()), 3));
            } catch (Exception e) {
                break;
            }
        }
    }
}
