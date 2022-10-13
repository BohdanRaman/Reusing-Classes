/**
 * Exercise 18: Create a class with a static final field and a final field and
 * demonstrate the difference between the two.
 */

public class StaticFinalFieldAndAFinalField {

    static final int INT = 17;    /*Final static field initialize one times on class load */
    final int anInt = 100;             /* Final field created every time on created instance */

    public int getIntField() {
        return INT+4;
    }

    public int getAnIntField() {
        return anInt + (-99);
    }
}
