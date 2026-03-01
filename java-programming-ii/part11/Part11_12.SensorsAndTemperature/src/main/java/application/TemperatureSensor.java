package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean status;

    public TemperatureSensor() {
        this.status = false;
    }

    public boolean isOn() {
        return status;
    }

    public void setOn() {
        status = true;
    }

    public void setOff() {
        status = false;
    }

    public int read() {
        if (status) {
            return new Random().nextInt(61) - 30;
        } else {
            throw new IllegalStateException("Can't read from a sensor that is off");
        }
    }
}
