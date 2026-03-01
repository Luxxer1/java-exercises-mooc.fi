package application;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {
    private List<Sensor> sensorList;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public boolean isOn() {
        for (Sensor sensor: sensorList) {
            if (!sensor.isOn()) {
                return false;
            }
        }

        return true;
    }

    public void setOn() {
        sensorList.forEach(Sensor::setOn);
    }

    public void setOff() {
        sensorList.get(0).setOff();
    }

    public int read() {
        if (sensorList.isEmpty() || !isOn()) {
            throw new IllegalStateException("Sensor is off or no sensor was added");
        }

        int read = (int) sensorList.stream()
                .mapToInt(Sensor::read)
                .average()
                .getAsDouble();

        readings.add(read);
        return read;
    }

    public void addSensor(Sensor sensor) {
        sensorList.add(sensor);
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
