package entities;

public class GoalkeeperPlayer extends Player {

    public GoalkeeperPlayer(String name, int number, int skill, double height, double reflexes) {
        super(name, number, skill);
        this.height = height;
        this.reflexes = reflexes;
    }

    @Override
    double getSkill() {
        return ((skill * 5) + (((int)(height * 100)) * 2) + (reflexes * 3)) / 10;
    }
}
