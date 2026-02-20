package FlightControl.ui;

import java.util.Scanner;

public class TextUI {
    Scanner scanner;

    public TextUI(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        startAssetControl();
    }

    private void startAssetControl() {
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            String answer = scanner.nextLine();

            if (answer.equals("1")) {

            } else if (answer.equals("2")) {

            } else if (answer.equals("X")) {
                break;
            }
        }
    }
}




