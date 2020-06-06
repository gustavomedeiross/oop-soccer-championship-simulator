package entities;

public class GoalkeeperPlayer extends Player {
    public GoalkeeperPlayer() {
    }

    public GoalkeeperPlayer(String name) {
        super(name);
    }

    public GoalkeeperPlayer(String name, int number) {
        super(name, number);
    }

    @Override
    double getSkill() {
        return ((skill * 5) + (((int)(height * 100)) * 2) + (reflexes * 3)) / 10;
    }
}
