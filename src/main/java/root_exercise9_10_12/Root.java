/**
 * Exercise 9: Create a class called Root that contains an instance of each of the classes
 * (that you also create) named Component1, Component2, and Component3. Derive a
 * class Stem from Root that also contains an instance of each “component.” All classes should
 * have default constructors that print a message about that class.
 * <p>
 * Exercise 10: Modify the previous exercise so that each class only has non-default
 * constructors.
 * <p>
 * Exercise 12: Add a proper hierarchy of dispose( ) methods to all the classes in
 * Exercise 9.
 */

package root_exercise9_10_12;

public class Root {

    public Root( String s) {
        System.out.println("Class Root constructor");
    }

    Component1 comp1 = new Component1("Component1 class");
    Component2 comp2 = new Component2("Component2 class");
    Component3 comp3 = new Component3("Component3 class");


    void dispose() {
        System.out.println("Root dispose");
        comp1.dispose();
        comp2.dispose();
        comp3.dispose();
    }

    public static void main(String[] args) {
        Root root = new Root("Root class");
        root.dispose();
    }
}

class Component1 {
    public Component1(String comp1) {
        System.out.println("Component1 constructor");
    }

    void dispose() {
        System.out.println("Component1 dispose");
    }
}

class Component2 {
    public Component2(String comp1) {
        System.out.println("Component2 constructor");
    }

    void dispose() {
        System.out.println("Component2 dispose");
    }
}

class Component3 {
    public Component3(String comp1) {
        System.out.println("Component2 constructor");
    }

    void dispose() {
        System.out.println("Component3 dispose");
    }
}

class Stem extends Root {

    public Stem(int stem)
    {
        super("super constructor");
        System.out.println("Class Stem constructor");
    }

    void dispose() {
        System.out.println("Step dispose");
        super.dispose();
        component1.dispose();
        component2.dispose();
        component3.dispose();
    }

    Component1 component1 = new Component1("Component1.0 class");
    Component2 component2 = new Component2("Component2.0 class");
    Component3 component3 = new Component3("Component3.0 class");
}




