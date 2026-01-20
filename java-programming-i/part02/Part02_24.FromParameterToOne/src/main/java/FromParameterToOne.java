

public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int until) {
        int limit = 1;

        for (int i = until; i >= limit; i--) {
            System.out.println(i);
        }
    }

}
