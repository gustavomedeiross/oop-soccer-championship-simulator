package entities;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Team {
    private String name;
    private List<GoalkeeperPlayer> goalkeeperPlayers;
    private List<DefenderPlayer> defenderPlayers;
    private List<MidfielderPlayer> midfielderPlayers;
    private List<ForwardPlayer> forwardPlayers;

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
        return Stream.of(goalkeeperPlayers, defenderPlayers, midfielderPlayers, forwardPlayers).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public void addPlayer(GoalkeeperPlayer player) {
        goalkeeperPlayers.add(player);
    }

    public void addPlayer(DefenderPlayer player) {
        defenderPlayers.add(player);
    }

    public void addPlayer(MidfielderPlayer player) {
        midfielderPlayers.add(player);
    }

    public void addPlayer(ForwardPlayer player) {
        forwardPlayers.add(player);
    }

    int getGoals() {
        int total = 0;

        for (Player player: getPlayers()) {
            total += player.getGoals();
        }

        return total;
    }

    double getTotalAttackingSkills() {
        double sum = 0;

        for (ForwardPlayer player: forwardPlayers) {
            sum += player.getSkill();
        }

        for (MidfielderPlayer player: midfielderPlayers) {
            sum += player.getSkill() / 2;
        }

        return sum;
    }

    double getTotalDefensiveSkills() {
        double sum = 0;

        for (GoalkeeperPlayer player: goalkeeperPlayers) {
            sum += player.getSkill();
        }

        for (DefenderPlayer player: defenderPlayers) {
            sum += player.getSkill();
        }

        for (MidfielderPlayer player: midfielderPlayers) {
            sum += player.getSkill() / 2;
        }

        return sum;
    }

    void scoreGoal() {
        int index = (int) Math.floor(Math.random() * forwardPlayers.size());
        forwardPlayers.get(index).scoreGoal();
    }
}
