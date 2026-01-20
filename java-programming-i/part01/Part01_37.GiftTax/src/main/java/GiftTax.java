
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.next());
        int tax5000 = 100;
        int tax25000 = 1700;
        double tax55000 = 4700;
        int tax200000 = 22100;
        int tax1000000 = 142100;

        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue == 5000) {
            System.out.println("Tax: " + tax5000);
        } else if (giftValue < 25000) {
            System.out.println("Tax: " + (tax5000 + (giftValue - 5000) * 0.08));
        } else if (giftValue == 25000) {
            System.out.println("Tax: " + tax25000);
        } else if (giftValue < 55000) {
            System.out.println("Tax: " + (tax25000 + (giftValue - 25000) * 0.10));
        } else if (giftValue == 55000) {
            System.out.println("Tax: " + tax55000);
        } else if (giftValue < 200000) {
            System.out.println("Tax: " + (tax55000 + (giftValue - 55000) * 0.12));
        } else if (giftValue == 200000) {
            System.out.println("Tax: " + tax200000);
        } else if (giftValue < 1000000) {
            System.out.println("Tax: " + (tax200000 + (giftValue - 200000) * 0.15));
        } else if (giftValue == 1000000) {
            System.out.println("Tax: " + tax1000000);
        } else if (giftValue > 1000000) {
            System.out.println("Tax: " + (tax1000000 + (giftValue - 1000000) * 0.17));
        }
    }
}
