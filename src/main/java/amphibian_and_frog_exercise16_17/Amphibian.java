/**
 * Exercise 16: Create a class called Amphibian. From this, inherit a class called
 * Frog. Put appropriate methods in the base class. In main( ), create a Frog and upcast it to
 * Amphibian and demonstrate that all the methods still work.
 * <p>
 * Exercise 17: Modify Exercise 16 so that Frog overrides the method definitions from
 * the base class (provides new definitions using the same method signatures). Note what
 * happens in main( ).
 */

package amphibian_and_frog_exercise16_17;

public class Amphibian {

    private int weightFrog;
    private int longFrog;

    public int getWeightFrog() {
        return weightFrog;
    }

    public void setWeightFrog(int weightFrog) {
        this.weightFrog = weightFrog;
    }

    public int getLongFrog() {
        return longFrog;
    }

    public void setLongFrog(int longFrog) {
        this.longFrog = longFrog;
    }

    public void getSay() {
        System.out.println("kva");;
    }

    public int jump( int m){
        return m;
    }

    @Override
    public String toString() {
        return "Amphibian:" +
                "weightFrog=" + weightFrog +
                ", longFrog=" + longFrog;
    }
}
