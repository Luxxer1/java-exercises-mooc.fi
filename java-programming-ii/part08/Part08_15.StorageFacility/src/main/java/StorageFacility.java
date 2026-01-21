import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public void remove(String storageUnit, String item) {

    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> content = this.storage.get(storageUnit);
        return (content != null) ? content : new ArrayList<>();
    }

    public ArrayList<String> storageUnits() {

        return null;
    }
}