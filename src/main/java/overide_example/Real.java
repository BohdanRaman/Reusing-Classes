package overide_example;

public class Real extends FootballTeam{

    public static void countFun(int count){
        System.out.println(count + " wow -wow");
    }

    @Override
    public void funSing(String text) {
        System.out.println("We are say: " + text);
    }

    @Override
    public void playerCount(int countPlayer) {
        System.out.println("yellow card: " + countPlayer);
    }
}
