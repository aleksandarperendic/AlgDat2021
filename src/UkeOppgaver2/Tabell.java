package UkeOppgaver2;

import java.util.Random;

public class Tabell {

    private Tabell() {
    } // privat standardkonstruktør - hindrer instansiering


    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] randPerm(int n) {
        int[] a = new int[n]; // fyller tabellen med 1, 2, . . , n
        for (int i = 0; i < n; i++) a[i] = i + 1;

        Random r = new Random();  // hentes fra java.util

        for (int k = n - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a, k, i);
        }

        return a; // tabellen med permutasjonen returneres

    } // randPerm

    public static void randPerm(int[] a) { // stokker om a

        Random r = new Random();  // hentes fra java.util

        for (int k = a.length - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a, k, i);
        }
    }

    public static int maks(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til)
            throw new IllegalArgumentException("Illegalt intervall!");

        int m = fra;             // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];  // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
            if (a[i] > maksverdi) {
                m = i;               // indeks til største verdi oppdateres
                maksverdi = a[m];    // største verdi oppdateres
            }

        return m;  // posisjonen til største verdi i a[fra:til>
    }

    public static int maks(int[] a) { // bruker hele tabellen
        return maks(a, 0, a.length);  // kaller metoden over
    }

    public static int min(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til)
            throw new IllegalArgumentException("Illegalt intervall!");


        int m = fra;             // indeks til minste verdi i a[fra:til>
        int minverdi = a[fra];  // minste verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
            if (a[i] < minverdi) {
                m = i;               // indeks til minste verdi oppdateres
                minverdi = a[m];    // minste verdi oppdateres
            }

        return m;  // posisjonen til minste verdi i a[fra:til>
    }

    public static int min(int[] a) { // bruker hele tabellen
        return min(a, 0, a.length);  // kaller metoden over
    }

    /* OPPGAVE 3 - Løsning her

    public static void bytt(char[] c, int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    } */

    // OPPGAVE 4
    public static void skriv(int[] a, int fra, int til) {
        System.out.print(a[fra]);
        for (int i = fra + 1; i < til; i++) {
            System.out.print(" " + a[i]);
        }
    }

    // OPPGAVE 5
    public static void skrivInn(int[] a, int fra, int til) {
        System.out.println(a[fra]);
        for (int i = fra + 1; i < til; i++) {
            System.out.println(+a[i]);
        }
        System.out.println();
    }

    // 1.2.3 - 1
    public static void fratilKontroll(int tablengde, int fra, int til) {
        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
    }

    public static void vhKontroll(int tablengde, int v, int h)
    {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }

}