package FlightControl.domain;

public class Place {
    String ID;

    public Place(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return ID;
    }
}
