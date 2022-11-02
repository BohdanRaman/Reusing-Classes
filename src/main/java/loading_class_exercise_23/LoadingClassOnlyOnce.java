/**
 * Exercise 23: Prove that class loading takes place only once. Prove that loading may
 * be caused by either the creation of the first instance of that class or by the access of a static
 * member.
 */

package loading_class_exercise_23;

public class LoadingClassOnlyOnce {

    private int count;
    private static int number;

    public LoadingClassOnlyOnce() {
        System.out.println("print constructor");
    }

    static {
        System.out.println("static block");
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static int getNumber() {
        return number;
    }

    public static int setNumber(int number) {
        return LoadingClassOnlyOnce.number = number;
    }
}
