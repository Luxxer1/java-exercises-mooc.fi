import java.util.ArrayList;

public class GradeStatistics {
    ArrayList<Integer> points;
    ArrayList<Integer> passingPoints;

    GradeStatistics() {
        this.points = new ArrayList();
        this.passingPoints = new ArrayList();
    }

    public ArrayList<Integer> getPoints() {
        return this.points;
    }

    public void add(int number) {
        int toPass = 50;

        this.points.add(number);
        if (number >= toPass) {
            this.passingPoints.add(number);
        }
    }

    private double average() {
        double average = 0.0;

        for (int point: this.points) {
            average += point;
        }

        return average / points.size();
    }

    private double passingAverage() {
        double passingAverage = 0.0;

        for (int point: this.passingPoints) {
            passingAverage += point;
        }

        if (passingAverage == 0) {
            return -1;
        }

        return passingAverage / this.passingPoints.size();
    }

    private double passPercentage() {
        return 100.0 * this.passingPoints.size() / this.points.size();
    }

    public String toString() {
        double passingAverage = this.passingAverage();

        String averageAll = "Point average (all): " + this.average() + "\n";
        String averagePassing = "";
        if (passingAverage > 0) {
            averagePassing = "Point average (passing): " + passingAverage + "\n";
        } else {
            averagePassing = "Point average (passing): -\n";
        }

        String passPercentage = "Pass percentage: " + this.passPercentage() + "\n";

        return averageAll + averagePassing + passPercentage;
    }
}
