/**
 * Exercise 16: Create a class called Amphibian. From this, inherit a class called
 * Frog. Put appropriate methods in the base class. In main( ), create a Frog and upcast it to
 * Amphibian and demonstrate that all the methods still work.
 * <p>
 * Exercise 17: Modify Exercise 16 so that Frog overrides the method definitions from
 * the base class (provides new definitions using the same method signatures). Note what
 * happens in main( ).
 */

package amphibian_and_frog;

public class Amphibian {

    public int getHeight(int i) {
        return i;
    }

    public int getWeight(int i) {
        return i;
    }

    public String getType(String s) {
        return s;
    }
}
