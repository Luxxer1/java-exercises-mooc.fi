
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        int three = 3;

        for (; beginning <= end; beginning++) {
            if ((beginning * 1.0) % three == 0) {
                System.out.println(beginning);
            }
        }
    }

}
