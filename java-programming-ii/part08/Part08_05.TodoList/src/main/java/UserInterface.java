import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        boolean loop = true;
        while (loop) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            switch (command) {
                case "add":
                    System.out.println("To add: ");
                    this.list.add(this.scanner.nextLine());
                    break;

                case "remove":
                    System.out.println("Which one is removed? ");
                    try {
                        this.list.remove(Integer.valueOf(scanner.nextLine()));
                    } catch (Exception e){
                        System.out.println("Error: " + e);
                    }
                    break;

                case "list":
                    this.list.print();
                    break;

                case "stop":
                    loop = false;
                    break;
            }
        }
    }
}
