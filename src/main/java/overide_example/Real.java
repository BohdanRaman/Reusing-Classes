package overide_example;

import java.util.List;

public class Real extends FootballTeam implements NameTeamFun {
    private String funName;
    private int ageFun;

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

    public static void fillTribune(int person) {

        if (person >= 70000 && person <= 80000) {
            System.out.println("sold out");
        }
        if (person >= 0 && person < 70000) {
            System.out.println("ticket really expensive");
        }
        if (person < 0 || person > 80000) {
            System.out.println("it is not possible to accommodate this number of fans ");
        }
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
