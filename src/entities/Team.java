package entities;

import java.util.List;

public class Team {
    private String name;
    private List<Player> players;
    private int goals;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public double getTotalTeamSkill() {
        double sum = 0;

        for (Player player: players) {
            sum += player.getSkill();
        }

        return sum;
    }
}
