/**
 * Exercise 23: Prove that class loading takes place only once. Prove that loading may
 * be caused by either the creation of the first instance of that class or by the access of a static
 * member.
 */

package loading_class;

public class LoadingClassOnlyOnce {

    private int anInt;
    static int c;

    public LoadingClassOnlyOnce() {
        System.out.println("print anInt");
    }

    static {
        System.out.println("static block");
    }

    public static int getC(int i) {
        return i;
    }

    public int getCMethod(int c) {
        return c;
    }

    public int getAnInt() {
        return anInt;
    }
}
