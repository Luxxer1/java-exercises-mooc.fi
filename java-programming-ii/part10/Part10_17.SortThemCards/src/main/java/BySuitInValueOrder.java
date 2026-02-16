import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    public int compare(Card c1, Card c2) {
        int sortedBySuit = new SortBySuit().compare(c1, c2);

        if (sortedBySuit == 0) {
            return c1.compareTo(c2);
        }

        return sortedBySuit;
    }
}
