import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;

    public SportStatistics(String[] statistics) {
        this.homeTeam = statistics[0];
        this.visitingTeam = statistics[1];
        this.homePoints = Integer.parseInt(statistics[2]);
        this.visitingPoints = Integer.parseInt(statistics[3]);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(file))) {
            int games = 0, wins = 0, losses = 0;

            System.out.println("Team: ");
            String team = scan.nextLine();

            while (readFile.hasNextLine()) {
                SportStatistics sport = new SportStatistics(readFile.nextLine().split(","));

                if (sport.homeTeam.equals(team) || sport.visitingTeam.equals(team)) {
                    games += 1;
                }

                if (sport.homeTeam.equals(team)) {
                    if (sport.homePoints > sport.visitingPoints) {
                        wins += 1;
                    } else {
                        losses += 1;
                    }
                } else if (sport.visitingTeam.equals(team)) {
                    if (sport.visitingPoints > sport.homePoints) {
                        wins += 1;
                    } else {
                        losses += 1;
                    }
                }
            }

            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
