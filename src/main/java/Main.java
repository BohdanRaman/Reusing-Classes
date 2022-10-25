import amphibian_and_frog.Amphibian;
import amphibian_and_frog.Frog;
import loading_class.LoadingClassOnlyOnce;

public class Main {
    public static void main(String[] args) {
        /* Task 17*/
        Amphibian frog = new Amphibian(10, 15);
        Amphibian frog1 = new Frog(1, 2, "GipnoZhaba");

        /* Task 18*/
        System.out.println("Task 18");
        StaticFinalFieldAndAFinalField field = new StaticFinalFieldAndAFinalField();
        System.out.println(field.anInt);
        System.out.println(field.getAnIntField());
        System.out.println(field.getIntField() + "\n");
        StaticFinalFieldAndAFinalField f2 = new StaticFinalFieldAndAFinalField();
        System.out.println(f2.anInt);
        System.out.println(f2.getAnIntField());
        System.out.println(f2.getIntField() + "\n");

        /* Task 23*/
        System.out.println("Task 23");
        LoadingClassOnlyOnce onlyOnce = new LoadingClassOnlyOnce();
        System.out.println(LoadingClassOnlyOnce.getC(100));
        System.out.println(onlyOnce.getCMethod(-100));
        System.out.println(onlyOnce.getAnInt());
    }
}
