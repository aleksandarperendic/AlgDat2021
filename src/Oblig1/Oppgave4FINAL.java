package Oblig1;

import java.util.Arrays;

public class Oppgave4FINAL {
    public static void main(String[] args) {
        int[] b = {1, 7, 2, 4, 6, 9};
        delsortering(b);
        System.out.println(Arrays.toString(b));
    }

    public static void delsortering(int[] a) {

        // Antall oddetall
        int teller = 0;

        // Sjekker om det er odetall og oppdaterer teller
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                int temp = a[teller];
                a[teller] = a[i];
                a[i] = temp;
                teller++;
            }
        }

        // Sorterer arrayet hvis det ikke finnes oddetall eller hvis alle tall er bare odetall
        if(teller == a.length || teller == 0) {
            Arrays.sort(a);
            // Sorterer hvis man har blanding av odetall og partall
        } else {
            // Sorterer odetall fra minste til største
            Arrays.sort(a,0,teller);
            // Sorterer partall på riktig plass
            Arrays.sort(a,teller,a.length);
        }
    }
}
