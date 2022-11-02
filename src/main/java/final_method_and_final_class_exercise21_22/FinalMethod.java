/**
 * Exercise 21: Create a class with a final method. Inherit from that class and attempt
 * to overwrite that method.
 */

package final_method_and_final_class_exercise21_22;

public class FinalMethod {

    public final String getFinalMethod(String text) {
        return text;
    }

    final void overrideMethod(String s) {
    }
    /* I can't inherit abd override final method overrideMethod*/
}
