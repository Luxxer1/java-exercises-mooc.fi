
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? ");
        int where = Integer.valueOf(scanner.next());
        System.out.println("Where from? ");
        int from = Integer.valueOf(scanner.next());
        for (int i = from; i <= where; i++) {
            System.out.println(i);
        }
    }
}
