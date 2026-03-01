package application;

import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor {
    private List<Sensor> sensorList;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
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

        return (int) sensorList.stream()
                .mapToInt(Sensor::read)
                .average()
                .getAsDouble();
    }

    public void addSensor(Sensor sensor) {
        sensorList.add(sensor);
    }
}
