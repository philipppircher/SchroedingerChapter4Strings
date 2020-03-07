package rheinwerk.computing.schroedinger.phil;

public class WorkingWithStrings {
    public static void main(String[] args) {
        // Schrödinger Page 136 - 138

        // Define Strings
        //
        // 1.) Eats alot of Space when initialised as new (out of Recyclingsystem String-Pool)
        String beispiel = new String("bla bla");

        // 2.) Recommended Usual initialisation (uses less space, is in Recyclingsystem String-Pool)
        String nochEinBeispiel = "Noch mehr bla bla";

        // 3.) Letterfetish create String with charArray (uses a lot of space, out of Recyclingsystem String-Pool)
        char[] buchstaben = {'B','l', 'a','b','l', 'a'};
        String nochEinAnderesBeispiel = new String(buchstaben);

        // 4.) The tinkerer (CONCATENATION, everytime concatenation happens, a new String object will be created)
        String undNochEinAnderesBeispiel = "Bla" + "bla";

        // Test output
        System.out.println("beispiel: " + beispiel);
        System.out.println("nochEinBeispiel: " + nochEinBeispiel);
        System.out.println("nochEinAnderesBeispiel: " + nochEinAnderesBeispiel);
        System.out.println("undNochEinAnderesBeispiel: " + undNochEinAnderesBeispiel);
    }
}
