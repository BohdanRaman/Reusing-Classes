/**
 * Create a simple class. Inside a second class, define a reference to an object
 * of the first class. Use lazy initialization to instantiate this object.
 */
package simple_exercise1;

public class FirstClass {
    private String a;
    private int b;
    private float c;
    private double d;

    public void printObject() {
        System.out.println("String s = " + a);
        System.out.println("int i = " + b);
        System.out.println("float f = " + c);
        System.out.println("double d = " + d);
    }

     static class SecondClass {
        public static void main(String[] args) {
            FirstClass firstClass = new FirstClass();
            firstClass.printObject();
            System.out.println();
        }
    }
}


