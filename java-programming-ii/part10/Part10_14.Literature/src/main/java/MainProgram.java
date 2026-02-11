import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

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

        System.out.println(books.size() + " books in total.");

        Comparator<Book> comparator = Comparator.
                comparing(Book::getAgeRecommendation).thenComparing(Book::getName);

        Collections.sort(books, comparator);

        System.out.println("Books: ");
        books.stream().forEach(System.out::println);
    }

}
