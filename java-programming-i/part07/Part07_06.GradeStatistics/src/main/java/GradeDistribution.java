import java.util.ArrayList;

public class GradeDistribution {
    String five, four, three, two, one, failed;

    GradeDistribution(ArrayList<Integer> points) {
        this.five = "5: ";
        this.four = "4: ";
        this.three = "3: ";
        this.two = "2: ";
        this.one = "1: ";
        this.failed = "0: ";

        for (int point: points) {
            if (point >= 90) {
                this.five += "*";
            } else if (point >= 80) {
                this.four += "*";
            } else if (point >= 70) {
                this.three += "*";
            } else if (point >= 60) {
                this.two += "*";
            } else if (point >= 50) {
                this.one += "*";
            } else {
                this.failed += "*";
            }
        }
    }

    public String toString() {
        return "Grade distribution:\n" +
                this.five + "\n" +
                this.four + "\n" +
                this.three + "\n" +
                this.two + "\n" +
                this.one + "\n" +
                this.failed;
    }
}
