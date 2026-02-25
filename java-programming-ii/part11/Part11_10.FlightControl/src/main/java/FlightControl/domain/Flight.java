package FlightControl.domain;

public class Flight {
    Airplane airplane;
    Place departurePlace;
    Place targetPlace;

    public Flight(Airplane airplane, Place departurePlace, Place targetPlace) {
        this.airplane = airplane;
        this.departurePlace = departurePlace;
        this.targetPlace = targetPlace;
    }

    @Override
    public String toString() {
        return airplane + " (" + departurePlace + "-" + targetPlace + ")";
    }
}
