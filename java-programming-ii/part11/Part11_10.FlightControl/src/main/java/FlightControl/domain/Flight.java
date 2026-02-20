package FlightControl.domain;

public class Flight {
    private Airplane airplane;
    private Place departureAirport;
    private Place targetAirport;

    public Flight(Airplane airplane, Place departureAirport, Place targetAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }

    @Override
    public String toString() {
        return this.airplane + " (" + this.departureAirport + "-" + this.targetAirport + ")";
    }
}
