
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] users = {"alex", "emma"};
        String[] pass = {"sunshine", "haskell"};

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        boolean found = false;
        
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(username)) {
                if (pass[i].equals(password)) {
                    System.out.println("You have successfully logged in");
                    found = true;
                }
            }
        }
        
        if (!found) {
            System.out.println("Incorrect username or password!");
        }       
    }
}
