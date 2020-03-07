package rheinwerk.computing.schroedinger.phil;

import java.util.Random;

public class StringCompare {
    public static void main(String[] args) {
        //Schrödinger Page 145 - 146

        // Methodes
        compareTwoStrings();
        checkSameInstance();
        partsComparison();
    }

    private static void compareTwoStrings(){
        String name = "Schrödinger";
        String nochEinName = "Schrödi" + "nger";
        boolean sindGleich = name.equals(nochEinName);  // returns true

        if (sindGleich)
            System.out.println("Beide Strings ident");
        else
            System.out.println("Strings nicht ident");
    }

    private static void checkSameInstance(){
        Random rand1 = new Random();
        Random rand2 = null;        // rand2 no ref to instance Random, false
        //rand2 = rand1;            // rand2 and rand1 ref to same Random instance, true
        //rand2 = new Random();     // rand2 ref to other Random instance than rand1, false

        if(rand2 == rand1)
            System.out.println("Instanzen ident");
        else
            System.out.println("Instanzen nicht ident");

        String name1 = "Phil";
        String name2 = name1;       // only value copy, no ref copy


        System.out.println(name1);  // same value as name2 and same instance
        System.out.println(name2);

        if (name2 == name1)
            System.out.println("Instanzen ident");
        else
            System.out.println("Instanzen nicht ident");

        name2 += "ipp";

        System.out.println(name1);  // keeps "Phil" even after name2 editing
        System.out.println(name2);  // name2 is chained name1 + "ipp" as a new instance
        if (name2 == name1)
            System.out.println("Instanzen ident");
        else
            System.out.println("Instanzen nicht ident");
    }

    private static void partsComparison(){
        // endsWith("")
        System.out.println("Urinstinkt".endsWith("instinkt"));
        // startsWith("")
        System.out.println("Tischlerei".startsWith("Ti"));
        // regionMatches()
        System.out.println("Der Tischler".regionMatches(5, "Der Fischer", 5, 6));
    }
}
