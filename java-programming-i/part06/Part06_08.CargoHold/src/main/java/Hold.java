import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = suitcase.totalWeight();

        if (!this.suitcases.isEmpty()) {
            for (Suitcase item: this.suitcases) {
                totalWeight += suitcase.totalWeight();
            }
        }

        if (totalWeight <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public String toString() {
        int items = 0;
        int totalWeight = 0;
        String sentence1 = "";


        if (!this.suitcases.isEmpty()) {
            items = this.suitcases.size();

            for (Suitcase item: this.suitcases) {
                totalWeight += item.totalWeight();
            }
        }

        String sentence2 = "(" + totalWeight + " kg)";

        switch (items) {
            case 0:
                sentence1 = "no suitcases ";
                break;

            case 1:
                sentence1 = items + " suitcase ";
                break;

            default:
                sentence1 = items + " suitcases ";
        }

        return sentence1 + sentence2;
    }

    public void printItems() {
        if (!this.suitcases.isEmpty()) {
            for (Suitcase item: this.suitcases) {
                item.printItems();
            }
        }
    }
}
