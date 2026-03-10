package dictionary;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
    String file;
    Map<String, String> dictionary;

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public void add(String word, String translation) {
        dictionary.putIfAbsent(word, translation);
    }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public void delete(String word) {
        dictionary.remove(word);
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                dictionary.putIfAbsent(parts[0], parts[1]);
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
