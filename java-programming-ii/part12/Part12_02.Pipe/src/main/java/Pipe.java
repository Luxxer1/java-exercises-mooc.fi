import java.util.List;
import java.util.ArrayList;

public class Pipe<T> {
    ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        values.add(value);
    }

    public T takeFromPipe() {
        if (!isInPipe()) {
            return null;
        }

        return values.remove(0);
    }

    public boolean isInPipe() {
        return !values.isEmpty();
    }
}
