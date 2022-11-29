package overide_example;

import java.util.List;

public class Real extends FootballTeam implements NameTeamFun {
private String funName;
private int ageFun;
    private List<FootballTeam> teamList;

    @Override
    public List<FootballTeam> getTeamList() {
        return teamList;
    }

    @Override
    public void setTeamList(List<FootballTeam> teamList) {
        this.teamList = teamList;
    }

    public Real(String funName, int ageFun) {
        this.funName = funName;
        this.ageFun = ageFun;
    }

    public void setFunName(String funName) {
        this.funName = funName;
    }

    public String getFunName() {
        return funName;
    }

    public int getAgeFun() {
        return ageFun;
    }

    public void setAgeFun(int ageFun) {
        this.ageFun = ageFun;
    }

    @Override
    public void getNameFun() {
        System.out.println("FC Barcelona fun");
    }

    @Override
    public String toString() {
        return "Real" +
                " funName = '" + funName + '\'' +
                ", ageFun = " + ageFun;
    }
}
