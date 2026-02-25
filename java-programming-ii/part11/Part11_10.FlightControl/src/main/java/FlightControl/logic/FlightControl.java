package FlightControl.logic;

import FlightControl.domain.Flight;
import FlightControl.domain.Airplane;

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
}
