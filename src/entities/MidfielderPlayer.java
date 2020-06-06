package entities;

public class MidfielderPlayer extends Player {
    public MidfielderPlayer() {
    }

    public MidfielderPlayer(String name) {
        super(name);
    }

    public MidfielderPlayer(String name, int number) {
        super(name, number);
    }

    @Override
    double getSkill() {
        return ((skill * 5) + (speed * 2) + (technique * 3) + (coverage * 3) + (tackle * 2)) / 10;
    }
}
