
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 100;
        int firstContainer = 0, secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + max);
            System.out.println("Second: " + secondContainer + "/" + max);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (amount > 0) {
                switch (command) {
                    case "add":
                        firstContainer += amount;
                        if (firstContainer > max) {
                            firstContainer = max;
                        }

                        break;

                    case "move":
                        int toMove = firstContainer - amount;

                        if ((toMove) >= 0) {
                            secondContainer += amount;
                            if (secondContainer > max) {
                                secondContainer = max;
                            }
                            firstContainer -= amount;
                        } else {
                            secondContainer += firstContainer;
                            if (secondContainer > max) {
                                secondContainer = max;
                            }
                            firstContainer = 0;
                        }

                        break;

                    case "remove":
                        secondContainer -= amount;
                        if (secondContainer < 0) {
                            secondContainer = 0;
                        }

                        break;
                }
            }
        }
    }

}
