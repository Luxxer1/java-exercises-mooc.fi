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
        this.storage.get(storageUnit).remove(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> content = this.storage.get(storageUnit);
        return (content != null) ? content : new ArrayList<>();
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageNames = new ArrayList<>();

        for(String unit: this.storage.keySet()) {
            if (!this.storage.get(unit).isEmpty()) {
                storageNames.add(unit);
            }
        }

        return storageNames;
    }
}