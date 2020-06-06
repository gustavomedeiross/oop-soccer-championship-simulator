import entities.*;

import java.util.ArrayList;

public class Example {
    public Team generateBarcelona() {

        Team team = new Team("Barcelona");
        team.addPlayer(new GoalkeeperPlayer("Ter Stegen", 1));
        team.addPlayer(new DefenderPlayer("Piqué", 3));
        team.addPlayer(new DefenderPlayer("Lenglet", 15));
        team.addPlayer(new DefenderPlayer("Sergi Roberto", 20));
        team.addPlayer(new DefenderPlayer("Jordi Alba", 18));
        team.addPlayer(new MidfielderPlayer("Segio Busquets", 5));
        team.addPlayer(new MidfielderPlayer("Arthur", 8));
        team.addPlayer(new MidfielderPlayer("de Jong", 21));
        team.addPlayer(new ForwardPlayer("Messi", 10));
        team.addPlayer(new ForwardPlayer("Griezmann", 17));
        team.addPlayer(new ForwardPlayer("Suaréz", 11));

        return team;
    }

    public Team generatePsg() {
        Team team = new Team("Paris Saint Germain");

        team.addPlayer(new GoalkeeperPlayer("Rico", 16));
        team.addPlayer(new DefenderPlayer("Kurwaza", 20));
        team.addPlayer(new DefenderPlayer("Kouassi", 35));
        team.addPlayer(new DefenderPlayer("Kehrer", 4));
        team.addPlayer(new DefenderPlayer("Dagba", 31));
        team.addPlayer(new MidfielderPlayer("Sarabia", 19));
        team.addPlayer(new MidfielderPlayer("Paredes", 8));
        team.addPlayer(new ForwardPlayer("Neymar", 7));
        team.addPlayer(new ForwardPlayer("Mbappe", 10));
        team.addPlayer(new ForwardPlayer("Cavani", 9));
        team.addPlayer(new ForwardPlayer("Chopo-Moting", 17));

        return team;
    }
}
