package Oblig1;

import java.util.Arrays;

public class Oppgave8 {
    public static void main(String[] args) {
        int[] a = {6,10,16,11,7,12,3,9,8,5};
        System.out.println(Arrays.toString(indekssortering(a)));

        // Utskrift: [6, 10, 16, 11, 7, 12, 3, 9, 8, 5] a er ikke endret
        // Utskrift: [6, 9, 0, 4, 8, 7, 1, 3, 5, 2]
    }

    public static int[] indekssortering(int[] a) {
        int[] indexSort = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            indexSort[i] = i;
        }
        boolean sortert;
        do {
            sortert = true;
            int bubble = indexSort[0];
            for (int i = 0; i < a.length - 1; i++) {
                if (a[bubble] > a[indexSort[i + 1]]) {
                    indexSort[i] = indexSort[i + 1];
                    indexSort[i + 1] = bubble;
                    sortert = false;
                } else {
                    bubble = indexSort[i + 1];
                }
            }
        } while (!sortert);

        return indexSort;
    }
}
