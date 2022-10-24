package amphibian_and_frog;

public class Frog extends Amphibian {

    /* I can expand functionality parent class */
    String nameFrog;

    public Frog(int weight, int height, String nameFrog) {
        super(weight, height);
        this.nameFrog = nameFrog;
    }
}
