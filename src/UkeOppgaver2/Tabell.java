package UkeOppgaver2;

import java.util.NoSuchElementException;
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
       /*  if (fra < 0 || til > a.length || fra >= til)
            throw new IllegalArgumentException("Illegalt intervall!"); */

        // OPPGAVE 1.2.3 - 3
        fratilKontroll(a.length,fra,til);

        if (fra == til)
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");

        // OPPGAVE 1.2.3 - 4
        if (a == null)
            throw new NullPointerException
                ("Finnes ikke noe i arrayet ditt.");

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
        fratilKontroll(a.length,fra,til); // OPPGAVE 1.2.3 - 5
        System.out.print(a[fra]);
        for (int i = fra + 1; i < til; i++) {
            System.out.print(" " + a[i]);
        }
    }

    // OPPGAVE 5
    public static void skrivInn(int[] a, int fra, int til) {
        fratilKontroll(a.length,fra,til); // OPPGAVE 1.2.3 - 5
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

    // OPPGAVE 1.2.4 - 1
    public static int[] nestMaks(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi

        if (m == 0)                            // den største ligger først
        {
            nm = maks(a, 1, n);                  // leter i a[1:n>
        }
        else if (m == n - 1)                   // den største ligger bakerst
        {
            nm = maks(a, 0, n - 1);              // leter i a[0:n-1>
        }
        else
        {
            int mv = maks(a, 0, m);              // leter i a[0:m>
            int mh = maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }

        return new int[] {m,nm};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks

    public static int[] nestMaksTre(int[] a)   // en turnering
    {
        int n = a.length;                // for å forenkle notasjonen

        if (n < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + n + ") < 2!");

        int[] b = new int[2*n];          // turneringstreet
        System.arraycopy(a,0,b,n,n);     // legger a bakerst i b

        for (int k = 2*n-2; k > 1; k -= 2)   // lager turneringstreet
            b[k/2] = Math.max(b[k],b[k+1]);

        int maksverdi = b[1], nestmaksverdi = Integer.MIN_VALUE;

        for (int m = 2*n - 1, k = 2; k < m; k *= 2)
        {
            int tempverdi = b[k+1];  // ok hvis maksverdi er b[k]
            if (maksverdi != b[k]) { tempverdi = b[k]; k++; }
            if (tempverdi > nestmaksverdi) nestmaksverdi = tempverdi;
        }

        return new int[] {maksverdi,nestmaksverdi}; // størst og nest størst

    } // nestMaks
}