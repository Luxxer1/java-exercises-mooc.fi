package dictionary;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
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
        dictionary.putIfAbsent(translation, word);
    }

    public String translate(String word) {
        return dictionary.getOrDefault(word, null);
    }

    public void delete(String word) {
        String translation = translate(word);

        dictionary.remove(word);
        dictionary.remove(translation);
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(new File(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                add(parts[0], parts[1]);
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            saveWords(writer);
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void saveWords(PrintWriter writer) {
        List<String> alreadySaved = new ArrayList<>();
        dictionary.forEach((key, word) -> {
            if (alreadySaved.contains(key)) return;

            alreadySaved.add(key);
            alreadySaved.add(word);

            String toSave = key + ":" + word;
            writer.println(toSave);
        });
    }
}
