
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        int maxLiquid = 100;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + maxLiquid);
            System.out.println("Second: " + secondContainer + "/" + maxLiquid);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            switch (command) {
                case "add":
                    if (value > 0) {
                        firstContainer += value;
                        if (firstContainer > maxLiquid) {
                            firstContainer = maxLiquid;
                        }
                    }

                    break;

                case "move":
                    if (value > 0) {
                        if (value > firstContainer) {
                            secondContainer += firstContainer;
                            if (secondContainer > maxLiquid) {
                                secondContainer = maxLiquid;
                            }
                            firstContainer = 0;
                        } else {
                            secondContainer += value;
                            firstContainer -= value;
                            if (secondContainer > maxLiquid) {
                                secondContainer = maxLiquid;
                            }
                        }
                    }

                    break;

                case "remove":
                    if (value > 0) {
                        secondContainer -= value;
                        if (secondContainer < 0) {
                            secondContainer = 0;
                        }
                    }

                    break;
            }
        }
    }

}
