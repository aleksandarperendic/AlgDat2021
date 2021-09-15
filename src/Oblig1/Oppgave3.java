package Oblig1;

public class Oppgave3 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,5,5,5};
        int b = antallUlikeUsortert(a);
        System.out.println(b);
    }

    public static int antallUlikeUsortert(int[] a) {
        int teller = 0;
        if (a.length >= 1) {
            teller = 1;
            for (int i = 1; i < a.length; i++) {
                int j;
                for (j = 0; j < i; j++) {
                    if (a[i] == a[j]) {
                        break;
                    }
                }
                if (i == j) {
                    teller++;
                }
            }
        }
       return teller;
    }
}

