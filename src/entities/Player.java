package entities;

abstract public class Player {
    protected String name;
    protected int number;
    protected Team team;
    protected int goals = 0;

    protected int skill;
    protected double height;
    protected double reflexes;
    protected int coverage;
    protected int tackle;
    protected double speed;
    protected int technique;

    public Player() { }

    public Player(String name, int number, int skill) {
        this.name = name;
        this.number = number;
        this.skill = skill;
    }

    abstract double getSkill();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public void scoreGoal() {
        goals++;
    }
}
