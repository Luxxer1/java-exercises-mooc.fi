import java.util.ArrayList;

public class BirdWatcher {
    ArrayList<Bird> birds;

    public BirdWatcher() {
        this.birds = new ArrayList<>();
    }

    public void add(Bird bird) {
        this.birds.add(bird);
    }

    public boolean findBird(String name) {
        for (Bird bird: this.birds) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public void observation(String name) {
        for (Bird bird: this.birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
            }
        }
    }

    public String printOneBird(String name) {
        String toPrint = "";

        for (Bird bird: this.birds) {
            if (bird.getName().equals(name)) {
                toPrint += bird;
            }
        }

        return toPrint;
    }

    public String toString() {
        String toPrint = "";

        for (Bird bird: this.birds) {
            toPrint += bird + "/n";
        }

        return toPrint;
    }
}
