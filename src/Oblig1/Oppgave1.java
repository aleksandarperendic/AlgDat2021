package Oblig1;

import java.util.Arrays;

public class Oppgave1 {

    public static void main(String[] args) {
        int[] a = {144, 1212, 6, 8, 2, 999, 11, 14, 9};
        int b = maks(a);
        System.out.println(b);
    }

    public static int maks(int[] a) {
        int maks_verdi = a[0];
        for (int i = 0; i < a.length-1; i++) {
            if (maks_verdi < a[i+1]) {
                int temp = maks_verdi;
                maks_verdi = a[i+1];
                a[i+1] = temp;
            }
        }
        return maks_verdi;
    }
}
