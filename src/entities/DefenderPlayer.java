package entities;

public class DefenderPlayer extends Player {
    public DefenderPlayer(String name, int number, int skill, int coverage, int tackle) {
        super(name, number, skill);
        this.coverage = coverage;
        this.tackle = tackle;
    }

    @Override
    double getSkill() {
        return ((float) ((skill * 5) + (coverage * 3) + (tackle * 2))) / 10;
    }
}
