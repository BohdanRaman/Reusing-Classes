package overide_example;

import java.util.List;

public class FootballTeam {
    List<FootballTeam> teamList;
    protected int countTeam;
    private String funSing;
    private int playerCount;

    public List<FootballTeam> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<FootballTeam> teamList) {
        this.teamList = teamList;
    }

    public int getCountTeam() {
        return countTeam;
    }

    public void setCountTeam(int countTeam) {
        this.countTeam = countTeam;
    }
    public String getFunSing() {
        return funSing;
    }

    public void setFunSing(String funSing) {
        this.funSing = funSing;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public NameTeamFun showFunTeams(Team team) {
        NameTeamFun nameFun = switch (team) {
            case REAL -> new Real();
            case BARCELONA -> new Barcelona();
            case MANCHESTER -> new ManchesterUnited();
            default -> throw new IllegalArgumentException("Unrnown football team " + team);
        };
        return nameFun;
    }

}
