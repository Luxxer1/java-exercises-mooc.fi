import java.util.ArrayList;

public class Box implements Packable {
    private final double maxWeight;
    private ArrayList<Packable> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (item == this) {
            return;
        }

        if (weight() + item.weight() <= maxWeight) {
            items.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;

        for (Packable item: items) {
            weight += item.weight();
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
