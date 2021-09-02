package UkeOppgaver2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestNestStorst {

    public static void main(String[] args) {

        int[] a = {8,5,7,11,1};
        int[] tallet = nestMaks(a);
        System.out.println(Arrays.toString(tallet));
    }

    // SPØRRE ANDRÉ
    public static int[] nestMaks(int[] a)
    {
        if (a.length < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + a.length + ") < 2!");

        int m = Tabell.maks(a);  // m er posisjonen til tabellens største verdi

        Tabell.bytt(a,a.length-1,m);  // bytter om slik at den største kommer forrest

        int k = Tabell.maks(a,0,a.length-2); // a.length-1 (fasiten)

        if (k == m) k = a.length-1; // den nest største lå opprinnelig forrest

        Tabell.bytt(a,a.length-1,m); // bytter tilbake

        return new int[] {m,k};

    } // nestMaks
}
