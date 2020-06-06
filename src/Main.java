import entities.Match;
import entities.Team;

public class Main {
    public static void main(String[] args) {
        Team team1 = Example.generateBarcelona();
        Team team2 = Example.generatePsg();

        Match match = new Match(team1, team2);
    }
}
