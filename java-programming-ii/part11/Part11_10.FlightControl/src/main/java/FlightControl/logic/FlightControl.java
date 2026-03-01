package FlightControl.logic;

import FlightControl.domain.*;

import java.util.Map;
import java.util.HashMap;

public class FlightControl {
    Map<String, Flight> flights;
    Map<String, Airplane> airplanes;

    public FlightControl() {
        this.flights = new HashMap<>();
        this.airplanes = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity) {
        this.airplanes.putIfAbsent(ID, new Airplane(ID, capacity));
    }

    public Airplane getAirplane(String ID) {
        return airplanes.get(ID);
    }

    public void addFlight(Airplane airplane, String departure, String target) {
        Flight flight = new Flight(airplane, new Place(departure), new Place(target));
    }
}
