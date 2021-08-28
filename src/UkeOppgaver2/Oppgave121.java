package UkeOppgaver2;

public class Oppgave121 {

    public static void main(String[] args) {

        int[] a = {1,13,5,9,8,5,2,6,14};
        int ret = main(a,1,4);

        System.out.println("Posisjon til minste verdi er: "+ret+", og det er tall: "+a[ret]);

    }

    public static int main(int[] a, int fra, int til)
    {
        /*if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        } */

        // OPPGAVE 1.2.3 - 2
        Tabell.fratilKontroll(a.length,fra,til);

        int m = fra;              // indeks til minste verdi i a[fra:til>
        int minverdi = a[fra];   // minste verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++) {
                // for (int i : a){ - Oppgave 5
            if (a[i] < minverdi) {
                m = i;                // indeks til minste verdi oppdateres
                minverdi = a[m];     // minste verdi oppdateres
            }
        }

        return m; // posisjonen til største verdi i a[fra:til>
    }
}
