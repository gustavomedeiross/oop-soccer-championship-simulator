package entities;

public class Match {
    private Team team1;
    private Team team2;
    private Team winner;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Team getWinner() {
        return winner;
    }

    public void start() {
        winner = null;
    }

    private void calculateOddsOfWinning() {
        int team1Skill = team1.getTotalTeamSkill();
        int team2Skill = team2.getTotalTeamSkill();

        int totalTeamsSkill = team1Skill + team2Skill;
        int team1OddsOfWinning = this.calculateSingleTeamOddOfWinning(team1Skill, totalTeamsSkill);
        int team2OddsOfWinnig = this.calculateSingleTeamOddOfWinning(team1Skill, totalTeamsSkill);
    }

    private int calculateSingleTeamOddOfWinning(int teamSkill, int bothTeamsTotalSkill) {
        return teamSkill * 100 / bothTeamsTotalSkill;
    }
}
