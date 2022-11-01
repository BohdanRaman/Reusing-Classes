package amphibian_and_frog_exercise16_17;

public class Frog extends Amphibian {

    /* I can expand functionality parent class */
    private String nameFrog;

    public String getNameFrog() {
        return nameFrog;
    }

    public void setNameFrog(String nameFrog) {
        this.nameFrog = nameFrog;
    }

    @Override
    public void getSay() {
        System.out.println("kvaaaaaaaaaa");
    }

    @Override
    public String toString() {
        return super.toString() + ", name="+ nameFrog;
    }
}
