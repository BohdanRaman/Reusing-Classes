/**
 * Create a simple class. Inside a second class, define a reference to an object
 * of the first class. Use lazy initialization to instantiate this object.
 */
package simple;

public class FirstClass {
    String s;
    int i;
    float f;
    double d;

    public void printObject() {
        System.out.println("String s = " + s);
        System.out.println("int i = " + i);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
    }

    static class SecondClass {

        public static void main(String[] args) {
            FirstClass firstClass = new FirstClass();
            firstClass.printObject();
        }
    }
}


