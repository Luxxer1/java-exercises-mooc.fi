import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private int currentWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.currentWeight = 0;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (currentWeight + item.getWeight() <= maxWeight) {
            items.add(item);
            currentWeight += item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
