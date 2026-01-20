import java.util.ArrayList;

public class Stack {
    private ArrayList<String> strings;

    public Stack() {
        strings = new ArrayList<>();
    }

    public boolean isEmpty() {
        return !(strings.size() > 0);
    }

    public void add(String value) {
        strings.add(value);
    }

    public String take() {
        int lastIndex = strings.size() - 1;

        String lastValue = strings.get(lastIndex);
        strings.remove(lastIndex);

        return lastValue;
    }

    public ArrayList<String> values() {
        return this.strings;
    }
}
