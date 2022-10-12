import amphibian_and_frog.Amphibian;
import amphibian_and_frog.Frog;

public class Main {
    public static void main(String[] args) {
        /* Task 17*/
        System.out.println("Task 17");
        Amphibian frog = new Frog();
        Amphibian frog1 = new Frog();

        System.out.println(frog.getHeight(12));
        System.out.println(frog.getWeight(15));
        System.out.println(frog.getType("Water" + "\n"));

        frog1.getHeight(2);
        frog1.getWeight(3);
        frog1.getType("Water frog");
        /* after overrides the method class Frog, in main class nothing happens */

        /* Task 18*/
        System.out.println("Task 18");
        StaticFinalFieldAndAFinalField staticFinalFieldAndAFinalField = new StaticFinalFieldAndAFinalField();
        System.out.println(staticFinalFieldAndAFinalField.anInt);

    }
}
