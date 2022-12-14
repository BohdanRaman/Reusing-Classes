package main;

import amphibian_and_frog_exercise16_17.Amphibian;
import amphibian_and_frog_exercise16_17.Frog;
import final_method_and_final_class_exercise21_22.FinalClass;
import final_method_and_final_class_exercise21_22.FinalMethod;
import final_method_and_final_class_exercise21_22.InheritFinalMethod;
import finalize_my_example.ManagerAndExampleFinalizeAndDispose;
import loading_class_exercise_23.LoadingClassOnlyOnce;
import overide_example.*;
import static_exercise18.StaticFinalFieldAndAFinalField;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Task 16*/
        System.out.println("Task 16");
        Amphibian frog = new Amphibian();
        Amphibian frog1 = new Frog();
        frog.getSay();
        frog1.getSay();
        System.out.println(frog.jump(50));
        System.out.println(frog1.jump(43) + "\n");
        /* All method basic class work after inherit and in child class. I can override basic class method in inherited class */

        /* My task "override_example" */
        System.out.println("My task \"override_example\":");
        FootballTeam footballTeam = new FootballTeam();
        NameTeamFun real = footballTeam.showFunTeams(Team.REAL);
        NameTeamFun barcelona = footballTeam.showFunTeams(Team.BARCELONA);
        NameTeamFun manchester = footballTeam.showFunTeams(Team.MANCHESTER);
        real.getNameFun();
        barcelona.getNameFun();
        manchester.getNameFun();
        footballTeam.fun();

        footballTeam.setFunSing("The best sing about FC");
        footballTeam.setCountTeam(3);
        footballTeam.setPlayerCount(11);
        System.out.println(footballTeam.getFunSing());
        System.out.println(footballTeam.getCountTeam());
        System.out.println(footballTeam.getPlayerCount());
        System.out.println();

        Real.fillTribune(350);
        Barcelona.fillTribune(84533);
        ManchesterUnited.fillTribune(79000);
        System.out.println("-----------------------------------------------");
        footballTeam.getFootballTeam();
        System.out.println();

        /* Task 18*/
        System.out.println("Task 18");
        StaticFinalFieldAndAFinalField field = new StaticFinalFieldAndAFinalField();
        System.out.println(field.getAnInt());
        System.out.println(StaticFinalFieldAndAFinalField.INT);
        System.out.println(field.getFinalField());
        System.out.println(field.getStaticFinalField() + "\n");
        StaticFinalFieldAndAFinalField f2 = new StaticFinalFieldAndAFinalField();
        System.out.println(f2.getAnInt());
        System.out.println(f2.getFinalField());
        System.out.println(f2.getStaticFinalField() + "\n");


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
        System.out.println(onlyOnce.getCount() + "\n");


        /* finalize task*/
        System.out.println("finalize task");
        ManagerAndExampleFinalizeAndDispose manager = new ManagerAndExampleFinalizeAndDispose();
        manager.setName("Java");
        System.out.println(manager.getName());
        manager.finalize();
        System.out.println();
        System.gc();
        System.out.println("If I coll 'System.gc()', finalization occurs for all objects ");
        manager.dispose();
    }
}
