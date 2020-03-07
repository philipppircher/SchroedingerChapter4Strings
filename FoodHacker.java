package rheinwerk.computing.schroedinger.phil;

import javax.swing.*;

public class FoodHacker {
    public static void main(String[] args) {
        String speise = "Dinkel mit Salat";

        System.out.println("Davor: " + speise);

        if (speise != null && speise.startsWith("Dinkel")) {
            if ("Dinkelpfannkuchen".equals(speise))
                speise = "Hamburger";
            else {
                speise = speise.substring("Dinkel".length());
                speise = "Hamburger" + speise;
            }
        }
        if (speise != null && speise.contains("Salat")) {
            speise = speise.replace("Salat", "Pommes");
        }

        System.out.println("Heute gibts " + speise);

        // Difficult Tusk, find same longest substring with contains()
        String s1 = "Tischlerei";
        String s2 = "Fische";
        String gemeinsamerSubstring = "";

        // Own Solution
        for (int i = 0; i < s1.length()-1; i++) {
            char currentChar = s1.charAt(i);
            if (s2.charAt(i) == currentChar){
                gemeinsamerSubstring += currentChar;
            }
        }

        System.out.println("Gemeinsamer längster Substring: " + gemeinsamerSubstring);

        // Easy Tusk
        String eingabe = "Isa";
        // 1.) "Eis"
        eingabe = "E" + eingabe.substring(0, 2).toLowerCase();
        System.out.println(eingabe);
        // 2.) "Heiss"
        eingabe = "H" + eingabe.substring(0, 3).toLowerCase() + eingabe.substring(2, 3);
        System.out.println(eingabe);
        // 3.) "Heisser"
        eingabe = eingabe.substring(0, 5) + eingabe.substring(1, 2) + "r";
        System.out.println(eingabe);
        // 4.) "Hosenscheisser"
        eingabe = eingabe.substring(0, 1) + "o" + eingabe.substring(4, 6) + "n" + eingabe.substring(3, 4)
                + "c" + eingabe.substring(0, 1).toLowerCase() + eingabe.substring(1, 3)
                + eingabe.substring(3, eingabe.length());
        System.out.println(eingabe);

        // Easy Tusk extended with own words
        String kuchen = "Käsekuchen, Karottenkuchen, Apfelkuchen";
        System.out.println(kuchen);
        kuchen = kuchen.replaceFirst("kuchen", "torte");
        System.out.println(kuchen);
        String txt = "Hallo";
        String text = new String(new char[] {'H', 'a', 'l', 'l', 'o'});      // txt und text variable zeigen auf das selbe "Hallo"
        String[] myArr = {"Hallo"};
        String[] myArr1 = myArr.clone();

        String schachfigur = "Läufer";
        String teppich = new String(new char[] {'L', 'ä', 'u', 'f', 'e', 'r'});
        String jemandDerVielLauft = teppich.intern();
        System.out.println(schachfigur == teppich);
        System.out.println(schachfigur == jemandDerVielLauft);
        System.out.println(teppich == jemandDerVielLauft);

        String[] strArr = new String[100];
        for (int i = 1; i <= 99; i++){
            System.out.println("Ballon");
        }
        String neueSchachfigur = schachfigur.replace("Läuf", "Bau");
        System.out.println(schachfigur);
        System.out.println(neueSchachfigur);
    }
}
