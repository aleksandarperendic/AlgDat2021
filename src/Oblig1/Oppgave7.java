package Oblig1;


import java.util.stream.Stream;

public class Oppgave7 {

    public static void main(String[] args) {
        // ABCD - EFGH (A E B F C G D H }
        String jedan = "FGIBZ AAAA";
        String dva = "ANUPI BBBB";
      //  String print = flett(jedan, dva);
        String print = flett("AAAA","BBBB");
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
        String ut = "";
        int lengde = 0;
        for (int k=0; k < s.length; k++){
            lengde += s[k].length();
        }
        for (int i=0; i < lengde; i++){
            for (int j=0; j < s.length; j++){
                if (i < s[j].length()){
                    char utskrift = s[j].charAt(i);
                    ut += utskrift;
                }
            }
        }
        return ut;
    }



}
