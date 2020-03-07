package rheinwerk.computing.schroedinger.phil;

import java.util.Arrays;

public class AccessToSingleCharacter {
    public static void main(String[] args) {
        // Schrödinger Page 138 - 141

        // String.charat(index) Method
        String name = "Schrödinger";
        System.out.println(name.charAt(0));     // First char Element in String object with index [0]
        System.out.println(name.charAt(name.length()-1));
        System.out.println();

        // String disassemble
        // Ax (String.substring(int) Method)
        String gegner = "Schleimiger Riesenschneckendrachen";
        System.out.println(".substring(int)");
        System.out.println(gegner);
        System.out.println(gegner.substring(12));
        System.out.println(gegner.substring(18));
        System.out.println(gegner.substring(27));
        name = "Philipp Pircher ist cool";
        System.out.println(name.substring(8));
        System.out.println(name.substring(16));
        System.out.println(name.substring(20));
        System.out.println();

        // Double Ax (String.substring(int, int) Method)
        System.out.println("substring(int,int)");
        System.out.println(gegner.substring(18,26));
        System.out.println(gegner.substring(12,26));
        System.out.println(name.substring(8,16));
        System.out.println("SuperTollGut".substring(5,9));
        System.out.println("HalloDuDa".substring(5,7));
        System.out.println("Omi Heli Jennerwein ist da".substring(4,19));

        // Splitting machine
        String frucht = "Ananas";
        String[] scheibchen = frucht.split("a");    // .split()-method returns array of Strings
        System.out.println(Arrays.toString(scheibchen));
        String myName = "Riesenschneckendrachen";
        String[] splits = myName.split("e");
        System.out.println(Arrays.toString(splits));
    }
}
