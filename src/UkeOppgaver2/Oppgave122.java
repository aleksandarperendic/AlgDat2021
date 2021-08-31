package UkeOppgaver2;

public class Oppgave122 {

    public static void main(String... args) {      // hovedprogram

       /* int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = Tabell.maks(a);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);
        System.out.println("OPPGAVE 4:");
        skriv(a);
        System.out.println();
        System.out.println("OPPGAVE 5:");
        skrivInn(a); */

        // OPPGAVE 1.2.4 - 1
        int[] a = Tabell.randPerm(20); // tilfeldig permutasjon av 1 . . 20
        int[] b = Tabell.nestMaks(a);  // metoden returnerer en tabell

        int m = b[0], nm = b[1];       // m for maks, nm for nestmaks

        skrivInn(a);        // se Oppgave 5 i Avsnitt 1.2.2
        System.out.print("Størst(" + a[m] + ") har posisjon " + m);
        System.out.println(", nest størst(" + a[nm] + ") har posisjon " + nm);
    } // main

    // Del av oppgave 4 (resten i tabell class)

    public static void skriv(int[] a) {
        Tabell.skriv(a, 0, a.length);
    }

    // Del av oppgave 5 (resten i tabell class)
    public static void skrivInn(int[] a) {
        Tabell.skrivInn(a, 0, a.length);
    }
}
