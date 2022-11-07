package finalize_my_example;

class Barcelona extends FootballManager {
    public Barcelona() {
        super();
    }

    void dispose() {
        System.out.println("Sell a player FC Barcelona");
    }
}

class RealMadrid extends FootballManager {
    public RealMadrid() {
        super();
    }

    void dispose() {
        System.out.println("Sell a player FC Real Madrid");
    }
}

class FootballManager {
    public FootballManager() {
    }

    void dispose() {
        System.out.println("Clean up a team manager");
    }
}

public class ManagerAndExampleFinalizeAndDispose extends FootballManager {

    private String name;

    public ManagerAndExampleFinalizeAndDispose() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void finalize() {
        System.out.println("Method 'finalize' called, when there is no object reference." + "\n" +
                "He can used one times or not used at all.");
    }

    Barcelona b = new Barcelona();
    RealMadrid r = new RealMadrid();
    FootballManager f = new FootballManager();

    public void dispose() {
        System.out.println("dismiss a football person");
        b.dispose();
        r.dispose();
        f.dispose();
    }
}