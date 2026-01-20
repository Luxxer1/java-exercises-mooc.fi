
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;

        while (i < number) {
            System.out.print("*");
            i++;
        }

        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int i = 0, rows = 0, even = 1, odd = 2, base = 3;

        // Print Tree Leaves
        while (rows < height) {
            if (i % odd != 0) {
                printSpaces(height - (rows + even));
                printStars(i);
                rows++;
            }

            i++;
        }

        // Print Tree Base
        for (int j = 0; j < odd; j++) {
            printSpaces(i / odd - odd);
            printStars(base);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
