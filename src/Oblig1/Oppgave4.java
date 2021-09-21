package Oblig1;

import java.util.Arrays;

public class Oppgave4 {

    public static void main(String[] args) {
        int[] a = {7, 2, 9, 4, 5, 8, 12};
        int[] b = {7, 2, 9, 4, -4, 5, 8, 12, -11, -13};
        //  delSortering(a);
        //    System.out.println("Med negative tall:");
        delsortering(b);
        System.out.println(Arrays.toString(b));
    }

    public static void delsortering(int[] verdier) {
        int fra = 0;
        int til = verdier.length - 1;
        int i = 0;

        while (i < verdier.length) {                              //sorterer et array med oddetall på venste side, og
            //partall på høyre, stopper når i > verdier.length

            while (til >= fra && verdier[fra]%2!=0) {             //kjører mens til er større/lik fra, og verdier[fra]
                //ikke gir tilbake et heltall når det deles med 2
                fra++;                                            //til er stoppeverdi for fra
            }
            while (til >= fra && verdier[til]%2==0) {             //kjører mens fra er større/lik til, og verdier[til]
                //gir tilbake et heltall når det deles med 2
                til--;                                            //fra er stoppverdi for til
            }

            if (fra < til) {
                bytt(verdier,fra++,til--); }                      //bytter om verdier[fra] og verdier[til]
            i++;
        }

        kvikksortering(verdier, 0, til);                    //bruker quicksort til å sortere oddetallene
        kvikksortering(verdier,fra, verdier.length - 1);    //bruker quicksort til å sortere partallene
    }

    private static void bytt(int[] verdier, int i, int j) {
        int temp = verdier[i];
        verdier[i] = verdier[j];
        verdier[j] = temp;    //Bytter posisjonen til verdier[i] og verdier[j]
    }

    private static void kvikksortering(int[] verdier, int fra, int til) {
        kvikksorteringStigende(verdier, fra, til);                          //sorterer verdier[fra:til] stigende
    }

    private static void kvikksorteringStigende(int[] verdier, int fra, int til) {
        if (fra >= til) {
            return;               //returnerer om verdier[fra:til] om verdier er tomt eller bare har 1 element
        }
        int midtverdi = sParterStigende(verdier, fra, til, (fra + til)/2);  //finner midtverdien

        kvikksorteringStigende(verdier, fra, midtverdi - 1);          //sorterer venstre siden av verdier
        kvikksorteringStigende(verdier, midtverdi + 1, til);          //sorterer høyreside av verdier
    }

    private static int sParterStigende(int[] verdier, int fra, int til, int skilleIndeks) {
        bytt(verdier, skilleIndeks, til);           //verdier[skilleIndeks] flyttes bakerst
        int posisjon = parterStigende(verdier, fra, til - 1, verdier[til]);  //partisjonerer verdier[fra:til-1]
        // i stigende rekkefølge
        bytt(verdier, posisjon, til);               //bytter for å få verdier[skilleIndeks] på rett plass
        return posisjon;                            //returnerer posisjonen til skilleverdien
    }

    private static int parterStigende(int[] verdier, int fra, int til, int skilleverdi) {
        while (true) {                                                //stopper når fra > til
            while (fra <= til && verdier[fra] < skilleverdi) {
                fra++;                                                //til er stoppverdi for fra
            }
            while (fra <= til && verdier[til] >= skilleverdi) {
                til--;                                                //fra er stoppverdi for til
            }

            if (fra < til) {
                bytt(verdier, fra++, til--);                          //bytter om a[fra] og a[til]
            }
            else  return fra;           //a[fra] er første verdi som ikke er mindre enn skilleverdi
        }
    }

}