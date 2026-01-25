import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (weightOfItems() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

    private int weightOfItems() {
        int weight = 0;
        for(Item item: items) {
            weight += item.getWeight();
        }

        return weight;
    }
}
