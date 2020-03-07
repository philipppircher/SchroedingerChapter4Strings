package rheinwerk.computing.schroedinger.phil;

public class EqualsNotEqualsPartEquals {
    public static void main(String[] args) {
        // Schrödinger Page 147 - 148
        args = new String[1];       // Array-instance with one element
        args[0] = "Schrödinger";    // Initialise element with index 0

        if (args[0].equals("Schrödinger") && args[0] != null)
            System.out.println("Hallo " + args[0]);
        else
            System.out.println("nicht Schrödinger");

        if ("Schrödinger".equals(args[0]))
            System.out.println("Hallo " + args[0]);
        else
            System.out.println("nicht Schrödinger");

        System.out.println();

        // Tusk longest suffix of both Strings
        String s1 = "Tischlerei";
        String s2 = "Fischerei";
        String gemeinsamesSuffix = "";


        for (int i = s1.length()-1; i >= 0; i--) {
            String teilstring = s1.substring(i);
            if (s2.endsWith(teilstring)){
                gemeinsamesSuffix = teilstring;
            } else {
                break;
            }
        }
        System.out.println(gemeinsamesSuffix);



    }
}
