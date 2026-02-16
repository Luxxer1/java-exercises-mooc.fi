import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    public int compare(Card c1, Card c2) {
        int suitComparison = c1.getSuit().compareTo(c2.getSuit());

        if (suitComparison != 0) {
            return suitComparison;
        }

        return Integer.compare(c1.getValue(), c2.getValue());
    }
}
