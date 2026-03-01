package FlightControl.ui;

import FlightControl.logic.FlightControl;
import FlightControl.domain.Airplane;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private FlightControl flightControl;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.flightControl = new FlightControl();
    }

    public void start() {
        startAssetControl();
        startFlightControl();
    }

    private void startAssetControl() {
        while (true) {
            System.out.println("Airport Asset Control\n" +
                    "[1] Add an airplane\n" +
                    "[2] Add a flight\n" +
                    "[x] Exit Airport Asset Control");

            String input = scanner.nextLine();
            if (input.equals("1")) {
                addAirplane();
            } else if (input.equals("2")) {
                addFlight();
            } else if (input.equals("x")) {
                break;
            }
        }
    }

    private void addAirplane() {
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());
        flightControl.addAirplane(id, capacity);
    }

    private void addFlight() {
        System.out.println("Give the airplane id: ");
        Airplane airplane = flightControl.getAirplane(scanner.nextLine());
        System.out.println("Give the departure airport id: ");
        String departure = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String target = scanner.nextLine();
        flightControl.addFlight(airplane, departure, target);
    }

    private void startFlightControl() {
        while (true) {
            System.out.println("Flight Control\n" +
                    "[1] Print airplanes\n" +
                    "[2] Print flights\n" +
                    "[3] Print airplane details\n" +
                    "[x] Quit");

            String input = scanner.nextLine();
            if (input.equals("1")) {
                flightControl.printAirplanes();
            } else if (input.equals("2")) {
                flightControl.printFlights();
            } else if (input.equals("3")) {
                printAirplaneDetails();
            } else if (input.equals("x")) {
                break;
            }
        }
    }

    private void printAirplaneDetails() {
        System.out.println("Give the airplane id: ");
        System.out.println(flightControl.getAirplane(scanner.nextLine()));
    }
}
