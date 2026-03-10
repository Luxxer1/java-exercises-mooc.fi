package dictionary;

import java.io.File;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class SaveableDictionary {
    private String file;
    private Map<String, String> dictionary;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String word, String translation) {
        dictionary.putIfAbsent(word, translation);
    }

    public String translate(String word) {
        return dictionary.getOrDefault(word, null);
    }

    public void delete(String word) {
        dictionary.remove(word);
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(new File(file));
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

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            dictionary.forEach((key, value) -> {
                writer.println(key + ":" + value);
            });

            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
