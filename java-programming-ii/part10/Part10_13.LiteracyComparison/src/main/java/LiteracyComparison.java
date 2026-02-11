import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        String fileName = "literacy.csv";

        try {
            List<Literacy> literacyList = Files.lines(Paths.get(fileName))
                    .map(row -> row.split(","))
                    .map(row -> new Literacy(row[2].replace("(%)", "").trim(), row[3], Integer.parseInt(row[4]), Double.parseDouble(row[5])))
                    .collect(Collectors.toList());

            literacyList.stream().sorted().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
