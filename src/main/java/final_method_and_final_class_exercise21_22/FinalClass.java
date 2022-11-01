/**
 * Exercise 22: Create a final class and attempt to inherit from it.
 */

package final_method_and_final_class_exercise21_22;

public final class FinalClass {
    /* I can't inherit class FinalClass*/

    private int i;
    private int anInt;
     final String string = "S";

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    /* I can't inherit final class FinalClass*/
}
