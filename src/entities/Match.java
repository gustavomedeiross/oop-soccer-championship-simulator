package entities;

public class Match {
    private Team team1;
    private Team team2;

    private static final int TOTAL_MATCH_MINUTES = 90;
    private static final int AVERAGE_MOVE_TIME = 2;
    private static final int TOTAL_MATCH_MOVES = TOTAL_MATCH_MINUTES / AVERAGE_MOVE_TIME;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public Team getWinner() {
        int team1Goals = team1.getGoals();
        int team2Goals = team2.getGoals();

        if (team1Goals > team2Goals) {
            return team1;
        } else if (team2Goals > team1Goals) {
            return team2;
        } else {
            return null;
        }
    }

    public String getFinalScore() {
        String output =  team1.getName() + " - " + team1.getGoals() + "\n";
        return output +  team2.getName() + " - " + team2.getGoals();
    }

    public void start() {
        Team currentAttackingTeam;
        Team currentDefendingTeam;

        // Basicamente eu estou considerando que cada time vai fazer uma jogada de cada vez
        for (int i = 0; i < TOTAL_MATCH_MOVES; i++) {
            if (i % 2 == 0) {
                currentAttackingTeam = team1;
                currentDefendingTeam = team2;
            } else {
                currentAttackingTeam = team2;
                currentDefendingTeam = team1;
            }

            double oddsOfScoringAGoal = getCurrentAttackingTeamOddsOfScoringAGoal(currentAttackingTeam, currentDefendingTeam);
            double randomNumber = Math.random() * 100;

            if (oddsOfScoringAGoal > randomNumber) {
                currentAttackingTeam.scoreGoal();
            }
        }
    }

    private double getCurrentAttackingTeamOddsOfScoringAGoal(Team attacker, Team defender) {
        double attackerSkills = attacker.getTotalAttackingSkills();
        double defenderSkills = defender.getTotalDefensiveSkills();

        double total = attackerSkills + defenderSkills;

        /**
         * ainda estou divindo o resultado final por 4 porque a chance de se fazer um gol já é naturalmente baixa em um jogo de futebol,
         * mesmo que um time seja muito melhor que o outro, provavelmente o gol não irá acontecer mais que 5 vezes em uma partida
         */
        return (attackerSkills * 100 / total) / 4;
    }
}
