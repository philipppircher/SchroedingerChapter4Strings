package rheinwerk.computing.schroedinger.phil;

public class SearchAndReplaceInStrings {
    public static void main(String[] args) {
        // Schrödinger Page 149 - 150
        System.out.println("Käsekuchen".indexOf('e'));      // returns Index of 'e' in "Käsekuchen"
        System.out.println("Fussball".indexOf('s'));        // Element 2

        String secret = "MySecret";
        char theChar = secret.charAt(3);

        if (theChar == 'e')
            System.out.println("True");

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == theChar)
                System.out.println(theChar + " " + i);
        }

        String kuchen = "Käsekuchen";
        System.out.println("Mamamia".indexOf('a', 2));
        System.out.println("Mamamia".lastIndexOf('m'));
        System.out.println("Käsekuchen".lastIndexOf("kuchen"));
        System.out.println("Käsekuchen".lastIndexOf('e', 4));
        System.out.println("Hallo".indexOf("llo"));
        System.out.println("Philipp Pircher".replace("Philipp", "Elija"));
        System.out.println(kuchen.replace("Käse", "Schokaladen"));
        System.out.println(kuchen);
        System.out.println("Fischers Fritz fischt frische Fische".replace("isch", "osch"));
    }
}
