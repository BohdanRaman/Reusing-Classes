package overide_example;

public class FootballTeam {
    protected int countTeam;
    private String funSing;
    private int playerCount;

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

    public NameTeamFun showFunTeams(Team team) {
        NameTeamFun nameFun = switch (team) {
            case REAL -> new Real("A", 13);
            case BARCELONA -> new Barcelona("B", 24);
            case MANCHESTER -> new ManchesterUnited("C", 54);
            default -> throw new IllegalArgumentException("Unrnown football team " + team);
        };
        return nameFun;
    }

    /* I can't use this method with "protected" access control  in other package.
    I can override this method */
    protected void getTeam(int i) {
        if (i == 0) {
            System.out.println("error");
        }
        for (int k = 0; k < i; k++) {
            System.out.println(i);
        }
    }

    public final void fun(){
        System.out.println("I can't override final method");
    }

    /* I can't use this method with "default" access control  in other package.
      I can override this method */
    String nameMyFavoriteTeam(String s) {
        String[] array = new String[]{"Real", "Barca", "MU"};
        for (String myTeam : array) {
            System.out.println(myTeam);
        }
        return s;
    }




    public FootballTeam[] getFootballTeam(int getTeam) {
        FootballTeam [] footballTeam = new FootballTeam[3];
 //       footballTeam [0] = new FootballTeam(Barcelona);
        return footballTeam;
    }
}
