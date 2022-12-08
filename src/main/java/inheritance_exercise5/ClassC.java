/**
 * Create two classes, A and B, with default constructors (empty argument lists) that announce themselves.
 * Inherit a new class called C from A, and create a member of class B inside C.
 * Do not create a constructor for C. Create an object of class C and observe the results.
 */

package inheritance_exercise5;

public class ClassC extends ClassA{

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        ClassC classC = new ClassC();
        System.out.println(classB.getClass());
        System.out.println(classC.getClass());
    }
}

