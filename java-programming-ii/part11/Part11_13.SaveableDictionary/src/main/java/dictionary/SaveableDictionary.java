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
        String translated = dictionary.getOrDefault(word, null);
        if (translated == null) {
            for (Map.Entry<String, String> entry: dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    translated = entry.getKey();
                    break;
                }
            }
        }

        return translated;
    }

    public void delete(String word) {
        if (dictionary.get(word) == null) {
            for (Map.Entry<String, String> entry: dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    dictionary.remove(entry.getKey());
                    break;
                }
            }
        } else {
            dictionary.remove(word);
        }
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
