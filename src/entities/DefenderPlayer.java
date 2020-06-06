package entities;

public class DefenderPlayer extends Player {
    public DefenderPlayer() {
    }

    public DefenderPlayer(String name) {
        super(name);
    }

    public DefenderPlayer(String name, int number) {
        super(name, number);
    }

    @Override
    double getSkill() {
        return ((float) ((skill * 5) + (coverage * 3) + (tackle * 2))) / 10;
    }
}
