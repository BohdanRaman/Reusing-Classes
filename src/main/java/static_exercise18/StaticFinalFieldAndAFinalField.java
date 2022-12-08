package static_exercise18;

/**
 * Exercise 18: Create a class with a static final field and a final field and
 * demonstrate the difference between the two.
 */

public class StaticFinalFieldAndAFinalField {

    public static final int INT = 1;            /*Final static field initialize one times on class load, constant */
    private final int anInt = 100;               /* Final field created every time on created instance */
    public int getAnInt() {
        return anInt;
    }
//  INT = 15;           I can't assign new value
    //  anInt = 15;         I can't assign new value

    public int getStaticFinalField() {
        return INT + 20;
    }

    public int getFinalField() {
        return anInt + 50;
    }
}
