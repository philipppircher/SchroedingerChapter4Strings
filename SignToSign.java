package rheinwerk.computing.schroedinger.phil;

public class SignToSign {
    public static void main(String[] args) {
        // Schrödinger Page 142 - 144
        // Code repair exercise
        beerExercise();
        valuesAndStringsExercise();

        // Difficult tusk
        String text = "Taumätawhakatangihangaköauaüotamateaturipukakapikimaungahoronukupkaiwhenuakitanatahu.";
        checkVokalLettersTusk(text);
    }

    private static void beerExercise(){
        int flaschenImKasten = 20;
        int flaschenImBauch = 5;

        System.out.println(flaschenImKasten + "-" + flaschenImBauch + " ist " + (flaschenImKasten - flaschenImBauch));
    }

    private static void valuesAndStringsExercise(){
        System.out.println(12 + "12");                      // output "1212" correct
        System.out.println("12" + 12);                      // output "1212" correct
        System.out.println(12 + 12 + "12");                 // output "2412" correct
        System.out.println(12 + (12 + "12"));               // output "121212" correct
        System.out.println("12" + 3 + 3 + "21");            // output "123321" correct
        //System.out.println("0" + 7 - 7 + "7");              // error, 7 - 7 in String not allowed, set () around 7 - 7
        System.out.println("0" + (7 - 7) + "7");              // output "007" correct
        System.out.println("Hexen".concat("meister"));        // output "Hexenmeister"
    }
    private static void checkVokalLettersTusk(String txt){
        String output = "";
        txt = txt.toLowerCase();
        System.out.println("Vocals with | replace, non vocals with . replace");
        System.out.println("Origin          : " + txt);
        System.out.print  ("Vokal | non .   : ");

        for (int i = 0; i < txt.length(); i++) {
            switch (txt.charAt(i)) {
                case 'a': case 'e': case 'i': case 'o': case 'u': case 'ä': case 'ö':  case 'ü':
                    output += "|";
                    break;
                default:
                    output += ".";
            }
        }

        System.out.print(output);
    }
}
