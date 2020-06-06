import entities.Match;
import entities.Team;

public class Main {
    public static void main(String[] args) {
        Team team1 = Example.generateBarcelona();
        Team team2 = Example.generatePsg();

        startMatch(team1, team2);

        team1 = Example.generateBarcelona();
        team2 = Example.generatePsg();

        startMatch(team1, team2);

        team1 = Example.generateBarcelona();
        team2 = Example.generatePsg();

        startMatch(team1, team2);
    }

    private static void startMatch(Team team1, Team team2) {
        Match match = new Match(team1, team2);
        System.out.println("=== Início da Partida ===");
        match.start();
        Team winner = match.getWinner();

        if (winner != null) {
            System.out.println("Vencedor: " + match.getWinner().getName());
        } else {
            System.out.println("Empate!");
        }

        System.out.println("Placar: " + match.getFinalScore());
    }
}
