
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String firstSentence = "The collection " + this.name + " ";
        String secondSentence = "has " + this.elements.size() + " elements:";
        String elements = "";

        if (this.elements.isEmpty()) {
            return firstSentence + "is empty.";
        }

        for (String element: getElements()) {
            elements += "\n" + element;
        }

        if (this.elements.size() == 1) {
            return firstSentence + "has " + this.elements.size() + " element:" + elements;
        }

        return firstSentence + secondSentence + elements;
    }
}
