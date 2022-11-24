package overide_example;

public class Barcelona extends FootballTeam implements NameTeamFun {

    @Override
    public void getNameFun() {
        System.out.println("FC Real Madrid fun");
    }
}
