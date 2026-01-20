
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int thisPrice = getPrice(this);
        int comparedPrice = getPrice(compared);

        if (thisPrice - comparedPrice < 0) {
            return (thisPrice - comparedPrice) * -1;
        }

        return thisPrice - comparedPrice;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return getPrice(this) > getPrice(compared);
    }

    public int getPrice(Apartment ap) {
        return ap.pricePerSquare * ap.squares;
    }

}
