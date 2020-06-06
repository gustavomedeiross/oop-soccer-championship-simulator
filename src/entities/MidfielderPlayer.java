package entities;

public class MidfielderPlayer extends Player {
    public MidfielderPlayer(String name, int number, int skill, double speed, int technique, int coverage, int tackle) {
        super(name, number, skill);
        this.speed = speed;
        this.technique = technique;
        this.coverage = coverage;
        this.tackle = tackle;
    }

    @Override
    double getSkill() {
        return ((skill * 5) + (speed * 2) + (technique * 3) + (coverage * 3) + (tackle * 2)) / 10;
    }
}
