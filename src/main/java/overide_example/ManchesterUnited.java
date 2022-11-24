package overide_example;

public class ManchesterUnited extends FootballTeam implements NameTeamFun {

    @Override
    public void getNameFun() {
        System.out.println("FC Manchester United fun");
    }
}
