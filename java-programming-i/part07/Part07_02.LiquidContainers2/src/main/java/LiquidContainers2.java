
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch (command) {
                case "add":
                    firstContainer.add(amount);
                    break;

                case "remove":
                    secondContainer.remove(amount);
                    break;

                case "move":
                    if (firstContainer.contains() > 0) {
                        int toMove = firstContainer.contains() - amount;

                        if (toMove < 0) {
                            toMove = firstContainer.contains();
                        } else {
                            toMove = amount;
                        }

                        firstContainer.remove(amount);
                        secondContainer.add(toMove);
                    }
            }
        }
    }

}
