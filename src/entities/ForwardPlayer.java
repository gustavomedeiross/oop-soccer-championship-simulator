package entities;

public class ForwardPlayer extends Player {
    public ForwardPlayer() {
    }

    public ForwardPlayer(String name) {
        super(name);
    }

    public ForwardPlayer(String name, int number) {
        super(name, number);
    }

    @Override
    double getSkill() {
        return ((skill * 5) + (speed * 2) + (technique * 3)) / 10;
    }
}
