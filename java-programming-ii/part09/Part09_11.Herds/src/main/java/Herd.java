import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {
    private List<Movable> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        organisms.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable organism: organisms) {
            organism.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String string = "";

        for (Movable organism: organisms) {
            string += organism + "\n";
        }

        return string;
    }
}
