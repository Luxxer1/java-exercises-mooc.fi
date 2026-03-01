package FlightControl.ui;

import FlightControl.logic.FlightControl;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private FlightControl flightControl;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        startAssetControl();
    }

    public void startAssetControl() {
        while (true) {
            System.out.println("Choose an action:\n" +
                    "[1] Add an airplane\n" +
                    "[2] Add a flight\n" +
                    "[x] Exit Airport Asset Control");

            String input = scanner.nextLine();
            if (input.equals("1")) {
                addAirplane();
            } else if (input.equals("2")) {

            } else if (input.equals("x")) {

            }
        }
    }

    public void addAirplane() {
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());
        flightControl.addAirplane(id, capacity);
    }
}
