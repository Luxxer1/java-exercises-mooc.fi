
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdWatcher birdWatcher = new BirdWatcher();

        Boolean loopBoolean = true;
        while(loopBoolean) {
            System.out.println("?");
            String command = scan.nextLine();
            switch (command) {
                case "Add":
                    System.out.println("Name: ");
                    String name = scan.nextLine();
                    System.out.println("Name in Latin: ");
                    String nameLatin = scan.nextLine();
                    birdWatcher.add(new Bird(name, nameLatin));
                    break;

                case "Observation":
                    System.out.println("Bird?");
                    String birdObservation = scan.nextLine();
                    if (birdWatcher.findBird(birdObservation)) {
                       birdWatcher.observation(birdObservation);
                    } else {
                        System.out.println("Not a bird!");
                    }
                    break;

                case "All":
                    System.out.println(birdWatcher);
                    break;

                case "One":
                    System.out.println("Bird?");
                    String bird = scan.nextLine();
                    if (birdWatcher.findBird(bird)) {
                        System.out.println(birdWatcher.printOneBird(bird));
                    } else {
                        System.out.println("Not a bird!");
                    }
                    break;

                case "Quit":
                    loopBoolean = false;
                    break;
            }
        }
    }

}
