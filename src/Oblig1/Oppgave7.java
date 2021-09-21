package Oblig1;


import java.util.stream.Stream;

public class Oppgave7 {

    public static void main(String[] args) {
        // ABCD - EFGH (A E B F C G D H }
        String jedan = "OLGRPE3";
        String dva = "BIGUP3";
        String print = flett(jedan, dva);
       // String print = flett("AAAA","BBBB");
        System.out.println(print);
        int proba = jedan.length()+dva.length();
        System.out.println(proba);
        System.out.println(fletting("JONAS","ALEKS","NIKO"));

        // JANOLINEKAKOSS

    }

    public static String flett(String s, String t) {
        String ut = "";
        int lengde = s.length()+t.length();
            for (int i = 0; i < lengde; i++) {
                 if (i < s.length()) {
                    char test = s.charAt(i);
                    ut += test + "";
                 } if (i < t.length()) {
                    char testT = t.charAt(i);
                    ut += testT + "";
                 }
            }
        return ut;
    }

    public static String fletting(String... s) {
        // Initierer string som returnerer og lengde av alle tall (startet på 0)
        String ut = "";
        int lengde = 0;
        // For-løkke som teller alle bokstaver og legger dem til lengde variabel
        for (int k=0; k < s.length; k++){
            lengde += s[k].length();
        }

        // For-løkke (i) som gå gjennom alle bokstavene,
        // samt for-løkke (j) som går gjennom alle ord.
        for (int i=0; i < lengde; i++){
            for (int j=0; j < s.length; j++){
                // Forhindrer IndexFeil
               if (i < s[j].length()){
                    char utskrift = s[j].charAt(i);
                    ut += utskrift;
                }
            }
        }
        // Returnerer verdi
        return ut;
    }



}
