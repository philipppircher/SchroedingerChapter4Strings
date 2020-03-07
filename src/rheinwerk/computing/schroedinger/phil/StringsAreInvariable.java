package rheinwerk.computing.schroedinger.phil;

public class StringsAreInvariable {
    public static void main(String[] args) {
        // Schrödinger Page 161 - 165
        StringBuilder stringBuilder = new StringBuilder();      // StringBuilder with new initialise!!!
        stringBuilder.append("String");                         // with append, concat String together
        stringBuilder.append("-");
        stringBuilder.append("Bilder");
        stringBuilder.insert(8, "u");                 // insert String at offset 8(8char from begin of String)
        System.out.println(stringBuilder);

        String aString = stringBuilder.toString();
        System.out.println(aString);

        int anzahl = 5;
        String s = "Yippie ";
        StringBuilder stringBuilder1 = new StringBuilder(s.length() * anzahl);
        for (int i = 0; i < anzahl; i++) {
            stringBuilder1.append(s);
        }
        System.out.println(stringBuilder1.toString());

        StringBuilder sb = new StringBuilder("Zu viiiiel");
        //sb.delete(4,7);
        sb.deleteCharAt(4).deleteCharAt(4).deleteCharAt(4);
        sb.replace(0, 2, "Aahh");
        sb.reverse();
        System.out.println(sb);

        // Tusk
        StringBuilder myBuilder = new StringBuilder(1399);

        for (int i = 0; i <= 99; i++) {
            myBuilder.append("Luftballon " + i + "\n");
        }
        System.out.println(myBuilder);
        System.out.println(myBuilder.length());

        // End of Chapter 4 Strings
    }
}
