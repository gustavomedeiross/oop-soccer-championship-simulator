import entities.*;

public class Example {
    public static Team generateBarcelona() {

        Team team = new Team("Barcelona");
        team.addPlayer(new GoalkeeperPlayer("Ter Stegen", 1, 7, 2.00, 5.00));
        team.addPlayer(new DefenderPlayer("Piqué", 3, 8, 9, 9));
        team.addPlayer(new DefenderPlayer("Lenglet", 15, 6, 7, 8));
        team.addPlayer(new DefenderPlayer("Sergi Roberto", 20, 7, 8, 7));
        team.addPlayer(new DefenderPlayer("Jordi Alba", 18, 7, 7, 8));
        team.addPlayer(new MidfielderPlayer("Segio Busquets", 5, 8, 8, 9, 7, 6));
        team.addPlayer(new MidfielderPlayer("Arthur", 8, 8, 8, 8, 7, 8));
        team.addPlayer(new MidfielderPlayer("de Jong", 21, 7, 9, 7, 7,  8));
        team.addPlayer(new ForwardPlayer("Messi", 10, 10, 9, 10));
        team.addPlayer(new ForwardPlayer("Griezmann", 17, 9, 8, 8));
        team.addPlayer(new ForwardPlayer("Suaréz", 11, 9, 8, 10));

        return team;
    }

    public static Team generatePsg() {
        Team team = new Team("Paris Saint Germain");

        team.addPlayer(new GoalkeeperPlayer("Rico", 16, 8, 1.98, 4.40));
        team.addPlayer(new DefenderPlayer("Kurwaza", 20, 8, 8, 8));
        team.addPlayer(new DefenderPlayer("Kouassi", 35, 7, 9, 7));
        team.addPlayer(new DefenderPlayer("Kehrer", 4, 6, 7, 7));
        team.addPlayer(new DefenderPlayer("Dagba", 31, 8, 8, 6));
        team.addPlayer(new MidfielderPlayer("Sarabia", 19, 8, 9, 9, 6, 4));
        team.addPlayer(new MidfielderPlayer("Paredes", 8, 7, 7, 8, 6, 6));
        team.addPlayer(new ForwardPlayer("Neymar", 7, 10, 9, 9));
        team.addPlayer(new ForwardPlayer("Mbappe", 10, 10, 10, 8));
        team.addPlayer(new ForwardPlayer("Cavani", 9, 9, 7, 9));
        team.addPlayer(new ForwardPlayer("Chopo-Moting", 17, 8, 9, 7));

        return team;
    }
}
