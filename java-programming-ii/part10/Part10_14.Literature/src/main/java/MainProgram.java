
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String inputName = scanner.nextLine();

            if (inputName.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation: ");
            int inputAge = Integer.parseInt(scanner.nextLine());

            books.add(new Book(inputName, inputAge));
        }
    }

}
