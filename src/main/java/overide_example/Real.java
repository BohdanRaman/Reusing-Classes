package overide_example;

public class Real extends FootballTeam implements NameTeamFun {
private String funName;
private int ageFun;

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

}
