    import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication Year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Books(title, pages, publicationYear));
        }

        System.out.print("What information will be printed? ");
        String whatPrint = scanner.nextLine();

        switch (whatPrint) {
            case "everything":
                for (Books book: books) {
                    System.out.println(book);
                }
                break;

            case "name":
                for (Books book: books) {
                    System.out.println(book.getTitle());
                }
                break;
        }
    }
}
