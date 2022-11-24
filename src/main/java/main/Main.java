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

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

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
        FootballTeam footballTeam = new FootballTeam();
        NameTeamFun real = footballTeam.showFunTeams(Team.REAL);
        NameTeamFun barcelona = footballTeam.showFunTeams(Team.BARCELONA);
        NameTeamFun manchester = footballTeam.showFunTeams(Team.MANCHESTER);

        real.getNameFun();
        barcelona.getNameFun();
        manchester.getNameFun();
        FootballTeam realTeam = new Real();
        FootballTeam barcelonaTeam = new Barcelona();
        FootballTeam muTeam = new ManchesterUnited();

        ArrayList<FootballTeam> teamArrays = new ArrayList<>();
        teamArrays.add(realTeam);
        teamArrays.add(barcelonaTeam);
        teamArrays.add(muTeam);
        System.out.println(teamArrays.toArray().length);

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
