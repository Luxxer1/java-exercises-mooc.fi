package dictionary;

import java.util.Map;
import java.util.HashMap;

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
}
