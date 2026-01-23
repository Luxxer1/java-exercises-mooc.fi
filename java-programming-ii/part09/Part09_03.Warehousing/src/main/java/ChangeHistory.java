import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        changeHistory.add(status);
    }

    public void clear() {
        changeHistory.clear();
    }

    public double maxValue() {
        double value = 0.0;

        for (double number: changeHistory) {
            if (number > value) {
                value = number;
            }
        }

        return value;
    }

    public double minValue() {
        double value = 0.0;

        if (changeHistory.isEmpty()) {
            return value;
        }

        value = changeHistory.get(0);
        for (double number: changeHistory) {
            if (number < value) {
                value = number;
            }
        }

        return value;
    }

    @Override
    public String toString() {
        return changeHistory.toString();
    }
}
