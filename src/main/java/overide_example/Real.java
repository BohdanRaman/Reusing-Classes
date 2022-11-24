package overide_example;

public class Real extends FootballTeam implements NameTeamFun {

    @Override
    public void getNameFun() {
        System.out.println("FC Barcelona fun");
    }
}
