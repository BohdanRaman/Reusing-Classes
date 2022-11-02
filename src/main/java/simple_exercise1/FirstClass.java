/**
 * Create a simple class. Inside a second class, define a reference to an object
 * of the first class. Use lazy initialization to instantiate this object.
 */
package simple_exercise1;

public class FirstClass {
    private String s;
    private int i;
    private float f;
    private double d;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

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


