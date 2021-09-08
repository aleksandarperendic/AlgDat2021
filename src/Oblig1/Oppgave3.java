package Oblig1;

public class Oppgave3 {
    public static void main(String[] args) {
        int[] a = {5,2,3,4,4,6,9,9,9,9};
        int b = antallUlikeUsortert(a);
        System.out.println(b);
    }

    public static int antallUlikeUsortert(int[] a) {
       /* int teller = 0;
        for(int i = 0; i < a.length -1; i++) {
            int tallsjekk = a[i];
            for (int j = 1; j < a.length -1; j++) {
                int tallsjekk2 = a[j];
                if(tallsjekk != tallsjekk2){
                    teller++;
                    tallsjekk = a[i+1];
                }
            }
        }
        return teller; */

        int teller = 0;
        int sjekker = a[0];
        for(int i = 1; i < a.length -1; i++) {
            if (sjekker != a[i] && a[i] != a[i+1]) {
                teller++;
            }
        }
        return teller;
    }
}
