package overide_example;

public class Barcelona extends FootballTeam implements NameTeamFun {
    private String funName;
    private int ageFun;

    public Barcelona(String funName, int ageFun) {
        this.funName = funName;
        this.ageFun = ageFun;
    }

    public String getFunName() {
        return funName;
    }

    public void setFunName(String funName) {
        this.funName = funName;
    }

    public int getAgeFun() {
        return ageFun;
    }

    public void setAgeFun(int ageFun) {
        this.ageFun = ageFun;
    }

    @Override
    public void getNameFun() {
        System.out.println("FC Real Madrid fun");
    }
}
