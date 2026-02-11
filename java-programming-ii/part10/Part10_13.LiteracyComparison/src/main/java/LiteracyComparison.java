
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        String fileName = "literacy.csv";

        try {
            Files.lines(Paths.get(fileName))
                    .sorted((p1, p2) ->
                            Double.valueOf(p1.split(",")[5]).compareTo(Double.valueOf(p2.split(",")[5]))
                    ).forEach(row -> {
                        String[] rowSplited = row.split(",");
                        System.out.println(rowSplited[3] + " (" + rowSplited[4] + "), " + rowSplited[2].split(" ")[1] + ", " + rowSplited[5]);
                    });
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
