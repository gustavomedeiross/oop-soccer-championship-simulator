package entities;

public class ForwardPlayer extends Player {
    public ForwardPlayer(String name, int number, int skill, double speed, int technique) {
        super(name, number, skill);
        this.speed = speed;
        this.technique = technique;
    }

    @Override
    double getSkill() {
        return ((skill * 5) + (speed * 2) + (technique * 3)) / 10;
    }
}
