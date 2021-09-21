package Oblig1;

public class Oppgave1Krav {

    public static void main(String[] args) {
        int[] a = {1,3,2,4,7,23,9,11};
        int b = ombyttinger(a);
        System.out.println(b);
    }

    public static int maks(int[] a) {

        if (a.length == 0) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException();
        // Startverdi for maks_verdi. Den oppdateres i for-løkke
      int maks_verdi = a[0];
      // For-løkke som går gjennom alle tall i arrayet og sjekker om tallet ved siden av er større
        for (int i = 0; i < a.length-1; i++) {
            // Sjekker om tallet ved siden er er mindre, og hvis den er mindre så bytter de
            // plass slik at det største tallet kommer på slutten av arayet.
            if (a[i] > a[i+1]) {
                maks_verdi = a[i];
                a[i] = a[i+1];
                a[i+1] = maks_verdi;
            } else {
                maks_verdi = a[i+1];
            }
        }
        // Returnerer maks_verdi som er plassert på slutten av arrayet
     return maks_verdi;
    }

    public static int ombyttinger(int[]a) {
        // Startverdi for maks_verdi. Den oppdateres i for-løkke
        int maks_verdi = 0;
        int teller = 0;
        // For-løkke som går gjennom alle tall i arrayet og sjekker om tallet ved siden av er større
        for (int i = 0; i < a.length-1; i++) {
            // Sjekker om tallet ved siden er er mindre, og hvis den er mindre så bytter de
            // plass slik at det største tallet kommer på slutten av arayet.
            if (a[i] > a[i+1]) {
                maks_verdi = a[i];
                a[i] = a[i+1];
                a[i+1] = maks_verdi;
                teller ++;
            }  else{
                maks_verdi = a[i+1];
            }
        }
        // Returnerer maks_verdi som er plassert på slutten av arrayet
        return teller;
    }
}
