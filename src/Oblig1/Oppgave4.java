package Oblig1;

import java.util.Arrays;

public class Oppgave4 {

    public static void main(String[] args) {
        int[] a = {7,2,9,4,5,-3,-11,8,12};
        delSortering(a);
    }

    public static void delSortering(int[] a) {

        for (int i = 0; i < a.length; ++i) {

            // Indre lække: bobler opp tall til riktig posisjon
            for (int j = a.length - 1; j > i; --j) {
                // Sjekk om tall på posisjon j og (j-1) er sortert riktig
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        for (int k = 0; k < a.length-1; k++) {
            for (int z = a.length - 1; z > k; --z) {
                if (a[z] % 2 == 1) {
                    int temp = a[z];
                    a[z] = a[z - 1];
                    a[z - 1] = temp;
                    if(temp > a[z] && a[z] % 2 == 1){
                        temp = a[z];
                        a[z] = a[z - 1];
                        a[z - 1] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
