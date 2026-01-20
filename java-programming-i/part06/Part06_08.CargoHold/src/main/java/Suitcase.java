import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int totalWeight = item.getWeight();

        if (!this.items.isEmpty()) {
            for (Item element: this.items) {
                totalWeight += element.getWeight();
            }
        }

        if (totalWeight <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public String toString() {
        int items = 0;
        int totalWeight = 0;
        String sentence1 = "";


        if (!this.items.isEmpty()) {
            items = this.items.size();

            for (Item item: this.items) {
                totalWeight += item.getWeight();
            }
        }

        String sentence2 = "(" + totalWeight + " kg)";

        switch (items) {
            case 0:
                sentence1 = "no items ";
                break;

            case 1:
                sentence1 = items + " item ";
                break;

            default:
                sentence1 = items + " items ";
        }

        return sentence1 + sentence2;

    }

    public void printItems() {
        if (!this.items.isEmpty()) {
            for (Item item: this.items) {
                System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
            }
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        if (!this.items.isEmpty()) {
            for (Item item: this.items) {
                totalWeight += item.getWeight();
            }
        }

        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);

        for (Item item: this.items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }
}
