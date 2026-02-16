import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.forEach(System.out::println);
    }

    public void sort() {
        cards.sort(null);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    public int sumCardsValue() {
        return cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
    }

    @Override
    public int compareTo(Hand another) {
        return sumCardsValue() - another.sumCardsValue();
    }
}
