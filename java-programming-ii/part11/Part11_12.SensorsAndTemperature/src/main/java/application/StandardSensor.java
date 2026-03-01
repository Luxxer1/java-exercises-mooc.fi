package application;

public class StandardSensor implements Sensor {
    private int sensorValue;
    private boolean status;

    public StandardSensor(int sensorValue) {
        this.sensorValue = sensorValue;
        this.status = true;
    }

    public boolean isOn() {
        return true;
    }

    public void setOn() {

    }

    public void setOff() {

    }

    public int read() {
        return sensorValue;
    }
}
