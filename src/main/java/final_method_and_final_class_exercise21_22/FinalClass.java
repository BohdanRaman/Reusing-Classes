/**
 * Exercise 22: Create a final class and attempt to inherit from it.
 */

package final_method_and_final_class_exercise21_22;

public final class FinalClass {
    public FinalClass() {
        System.out.println("Colling constructor after block");
    }

    {
        final String TEXT = "Block is colling first";
        System.out.println("'final String TEXT': " + TEXT);
    }

    private int number;
    private int anInt;
    private final String STRING = "String";

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getString() {
        return STRING;
    }

    @Override
    public String toString() {
        return "FinalClass contains: " +
                "i = " + number +
                ", anInt = " + anInt +
                ", STRING = " + STRING;
    }
}
