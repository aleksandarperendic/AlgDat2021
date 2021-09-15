package Oblig1;

import java.util.Arrays;

public class Oppgave10 {

    public static void main(String[] args) {
        String en = "YXXY";
        String to = "AAAAAAAYXXY";
        System.out.println(inneholdt(en,to));
    }

    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        boolean sjekker = false;
        char[] ord1 = a.toCharArray();
        char[] ord2 = b.toCharArray();
        if (ord1.length <= ord2.length) {
            int teller = 0;
            bubble10(ord1);
            bubble10(ord2);
            for (int i = 0; i < ord2.length; i++) {
                if (teller < ord1.length) {
                    if (ord2[i] == ord1[teller]) {
                        teller++;
                    }
                }
            }
            if (teller == ord1.length) {
                return sjekker = true;
            }
        }
        return sjekker;
    }

    public static void bubble10(char[] values) {
        // To for-løkker:
        // Ytre løkke: sorterer ett tall per gjennomgang
        for (int i = 0; i < values.length; i++) {
            // Indre lække: bobler opp tall til riktig posisjon
            for (int j = values.length - 1; j > i; --j) {
                // Sjekk om tall på posisjon j og (j-1) er sortert riktig
                if (values[j] < values[j - 1]) {
                    char temp = values[j];
                    values[j] = values[j - 1];
                    values[j - 1] = temp;
                }

            }
        }
      //  System.out.println("Sorterte verdier:");
     //   System.out.println(Arrays.toString(values));

    }
}
