import amphibian_and_frog.Amphibian;
import amphibian_and_frog.Frog;
import blank_final.BlankFinal;
import loading_class.LoadingClassOnlyOnce;

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
        StaticFinalFieldAndAFinalField field = new StaticFinalFieldAndAFinalField();
        System.out.println(field.anInt);
        System.out.println(field.getAnIntField());
        System.out.println(field.getIntField()+ "\n");

        /* Task 19*/
        System.out.println("Task 19" + "\n");
        BlankFinal blankFinal = new BlankFinal();

        /* Task 23*/
        System.out.println("Task 23");
        LoadingClassOnlyOnce onlyOnce = new LoadingClassOnlyOnce();
        System.out.println(LoadingClassOnlyOnce.getC(100));
        System.out.println(LoadingClassOnlyOnce.getCMethod(-100));
        System.out.println(onlyOnce.getAnInt());

    }
}
