package UkeOppgaver2;

public class Oppgave122 {

    public static void main(String... args) {      // hovedprogram

        int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = Tabell.maks(a);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);
        System.out.println("OPPGAVE 4:");
        skriv(a);
        System.out.println();
        System.out.println("OPPGAVE 5:");
        skrivInn(a);
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
