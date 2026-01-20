import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String inputCommand = scanner.next();

            if (inputCommand.equals("end")) {
                break;
            }

            if (inputCommand.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.next();
                System.out.print("Translation: ");
                String translation = scanner.next();
                this.dictionary.add(word, translation);
            }

            if (inputCommand.equals("search")) {
                System.out.print("To be translated: ");
                String toTranslate = scanner.next();
                String translated = this.dictionary.translate(toTranslate);
                if (translated == null) {
                    System.out.println("Word " + toTranslate + " was not found");
                } else {
                    System.out.println("Translation: " + translated);
                }
            }

            System.out.println("Unknown command");
        }

        System.out.println("Bye bye!");
    }
}
