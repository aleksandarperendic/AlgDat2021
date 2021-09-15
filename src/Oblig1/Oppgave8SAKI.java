package Oblig1;

import java.util.Arrays;

public class Oppgave8SAKI {

    public static void main(String[] args) {
        int[] a = {6,10,16,11,7,12,3,9,8,5,5};
        System.out.println(Arrays.toString(indekssorteringLars(a)));

        // Utskrift: [6, 10, 16, 11, 7, 12, 3, 9, 8, 5] a er ikke endret
        // Utskrift: [6, 9, 0, 4, 8, 7, 1, 3, 5, 2]
    }

    public static int[] indekssortering(int[] a) {
        //throw new UnsupportedOperationException();

        //initierer den nye tabellen som metoden skal returnere
        int[] index = new int[a.length];
        for (int i = 0; i < a.length ; i++) {
            index[i] = i;
        }
            //Antall tall som er mindre enn a[i] sier hvilken indeks tallet skal ha i den nye tabellen
        boolean sortert = false;
        while (!sortert) {
            sortert = true;
            int bubble = index[0];
            for (int j = 0; j < a.length - 1; j++) {
                if (a[bubble] > a[index[j + 1]]) {
                    index[j] = index[j + 1];
                    index[j + 1] = bubble;
                    sortert = false;
                } else {
                    bubble = index[j + 1];
                }
            }
        }



            //int antallmindre blir indeksen i den nye tabbelen. "i" peker på hvor i tabellen "a", tallet ligger.
            // Eks: indeks 0 i tabell "a" er det største tallet i tabellen. Det har 9 tall som er mindre seg,
            // og skal da ligge i indeks 9, i den nye tabellen(index). I index(den nye tabellen) har da indeks 9 verdi 0,
            // fordi den peker på hvor tallet ligger i tabell a.

            //index[antallmindre] = i;

        return index;
    }

    public static int[] indekssorteringLars(int[] a) {
        //throw new UnsupportedOperationException();

        //initierer den nye tabellen som metoden skal returnere
        int[] index = new int[a.length];

        for (int i = 0; i < a.length ; i++){

            //Antall tall som er mindre enn a[i] sier hvilken indeks tallet skal ha i den nye tabellen
            int antallmindre = 0;
            for (int j = 0; j < a.length; j++){
                if (a[i] > a[j]){
                    antallmindre++;
                } else if (a[i] == a[j] && i < j){
                    antallmindre++;
                }
            }

            //int antallmindre blir indeksen i den nye tabbelen. "i" peker på hvor i tabellen "a", tallet ligger.
            // Eks: indeks 0 i tabell "a" er det største tallet i tabellen. Det har 9 tall som er mindre seg,
            // og skal da ligge i indeks 9, i den nye tabellen(index). I index(den nye tabellen) har da indeks 9 verdi 0,
            // fordi den peker på hvor tallet ligger i tabell a.

            index[antallmindre] = i;
        }
        return index;
    }

    public static int[] indekssorteringSasa(int[] a) {
        int[] index = new int[a.length];
        for (int i = 0; i < a.length-1; i++) {
            int antallmindre = 0;
            if (a[i] > a[i+1]){
                antallmindre++;
            } else if (a[i] == a[i+1]) {
                antallmindre++;
            }
            index[antallmindre] = i;
        }
        return index;
    }
}
