public class Bird {
    private String name;
    private String nameLatin;
    private int observation;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observation = 0;
    }

    public String getName() {
        return this.name;
    }

    public void addObservation() {
        this.observation += 1;
    }

    public String toString() {
        return this.name + " (" + this.nameLatin + "): " + this.observation + " observations";
    }
}
