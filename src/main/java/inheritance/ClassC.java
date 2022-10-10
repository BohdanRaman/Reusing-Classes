/**
 * Create two classes, A and B, with default constructors (empty argument lists) that announce themselves.
 * Inherit a new class called C from A, and create a member of class B inside C.
 * Do not create a constructor for C. Create an object of class C and observe the results.
 */

package inheritance;

public class ClassC extends ClassA{

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        ClassC c = new ClassC();
        System.out.println(c);
    }
}

