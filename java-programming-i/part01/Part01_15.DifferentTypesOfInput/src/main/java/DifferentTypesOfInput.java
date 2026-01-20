
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string = scanner.nextLine();
        System.out.println("Give an integer:");
        int numberInteger = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double numberDouble = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean booleanInput = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + numberInteger);
        System.out.println("You gave the double " + numberDouble);
        System.out.println("You gave the boolean " + booleanInput);
    }
}
