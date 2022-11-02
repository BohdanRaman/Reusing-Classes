import amphibian_and_frog_exercise16_17.Amphibian;
import amphibian_and_frog_exercise16_17.Frog;
import final_method_and_final_class_exercise21_22.FinalClass;
import final_method_and_final_class_exercise21_22.FinalMethod;
import final_method_and_final_class_exercise21_22.InheritFinalMethod;
import loading_class_exercise_23.LoadingClassOnlyOnce;
import overide_example.Barcelona;
import overide_example.FootballTeam;
import overide_example.ManchesterUnited;
import overide_example.Real;
import static_exercise18.StaticFinalFieldAndAFinalField;

public class Main {
    public static void main(String[] args) {
        /* Task 16*/
        System.out.println("Task 16");
        Amphibian frog = new Amphibian();
        Frog frog1 = new Frog();
        frog.setLongFrog(11);
        frog.setWeightFrog(21);
        frog1.setWeightFrog(2);
        frog1.setLongFrog(3);
        frog1.setNameFrog("Frog Zhaba");
        frog.getSay();
        frog1.getSay();
        frog.jump(50);
        System.out.println(frog);
        System.out.println(frog1 + "\n");

        /* My task */
        System.out.println("My task");
        FootballTeam barcelona = new Barcelona();
        FootballTeam real = new Real();
        FootballTeam mu = new ManchesterUnited();
        FootballTeam.countFun(100000);
        Barcelona.countFun(84000);
        Real.countFun(80000);
        ManchesterUnited.countFun(85000);
        barcelona.funSing("go-go-go");
        barcelona.playerCount(1);
        real.funSing("oleeee ole ole oleeee");
        real.playerCount(5);
        mu.funSing("we are the champions");
        mu.playerCount(3);
        System.out.println();


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

        /* Task 22*/
        System.out.println("Task 22");
        FinalClass finalClass = new FinalClass();
        finalClass.setNumber(13);
        finalClass.setAnInt(34);
        System.out.println(finalClass);
        System.out.println("I can't inherit class FinalClass" + "\n");

        FinalMethod finalMethod = new FinalMethod();
        System.out.println(finalMethod.getFinalMethod("this is public final method"));
        System.out.println("I can't inherit and override final method overrideMethod" + "\n");

        InheritFinalMethod inheritFinalMethod = new InheritFinalMethod();
        System.out.println(inheritFinalMethod.getFinalMethod("I can inherit final method if he has access modifier public, " +
                                                                 "but I can't override this method") + "\n");

        /* Task 23*/
        System.out.println("Task 23");
        LoadingClassOnlyOnce onlyOnce = new LoadingClassOnlyOnce();
        onlyOnce.setCount(4);
        LoadingClassOnlyOnce.setNumber(14);
        System.out.println(LoadingClassOnlyOnce.getNumber());
        System.out.println(onlyOnce.getCount());
    }
}
