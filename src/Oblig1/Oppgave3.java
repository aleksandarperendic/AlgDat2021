package Oblig1;

public class Oppgave3 {
    public static void main(String[] args) {
        int[] a = {1,3,2,2,2,2,2,2};
        int b = antallUlikeUsortert(a);
        System.out.println(b);
    }

    public static int antallUlikeUsortert(int[] a) {
        int teller = 0;
        if (a.length > 1) {
            teller = 1;
            for (int i = 1; i < a.length; i++) {
                int j;
                for (j = 0; j < i; j++)
                    if (a[i] == a[j]) break;
                if (i == j)
                    teller++;

            }
        }
       return teller;
       }
    }

