package FlightControl.logic;

import java.util.Map;
import java.util.HashMap;
import FlightControl.domain.*;

public class FlightControl {
    Map<String, Airplane> airplanes;
    Map<String, Place> places;
    Map<String, Flight> flights;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.places = new HashMap<>();
        this.flights = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity) {
        // Handle message or change to putIfAbsent
        airplanes.put(ID, new Airplane(ID, capacity));
    }
}
