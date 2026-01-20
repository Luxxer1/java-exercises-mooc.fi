
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            boolean isEqual = false;

            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book newBook = new Book(name, publicationYear);



            for (Book book: books) {
                if (book.equals(newBook)) {
                    isEqual = true;
                    break;
                }
            }

            if (!isEqual) {
                books.add(newBook);
            } else {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            }

        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
