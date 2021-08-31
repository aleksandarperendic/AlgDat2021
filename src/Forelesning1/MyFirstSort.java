package Forelesning1;

public class MyFirstSort {

    public static void main(String[] args) {
        System.out.println("Hello algdat");

        int values[] = {1, 7, 2, 4, 6, 9};

        myFirstSort(values);

    }

    /**
     * Findmax - finner index til største tall i et array,
     * men søker bare innenfor tallene i (fra,til)
     */

    public static int findMax(int[] values, int fra, int til){
        // Initialiser ved å se på første "kort"
        // Dette er det største tallet jeg har funnet så langt
        int index = fra;
        int max_value = values[fra];

        // Sjekk at grensene for løkken er riktig.
        for(int i=fra+1; i<til; ++i){
            // Sjekk om vi har funnet nytt største tall
            if (values[i] > max_value){
                max_value = values[i];
                index = i;
            }
        }
        // Returnerer index
        return index;
    }

    /**
     * Denne funksjon tar inn ett array med verdiere (heltall),
     * og sorterer dem "in place"
     * @param values Verdier vi skal sortere.
     */

    public static void myFirstSort(int[] values){
        for (int k = 0; k < values.length - 1; ++k) {
            int max_index = findMax(values, k, values.length);
         //   System.out.println("Største verdi ligger på plass: " + max_index + " og har verdi: " + values[max_index]);

            // 2) Bytte plass på tall på plass 0 og max_index
            int temp = values[k];
            values[k] = values[max_index];
            values[max_index] = temp;

        /*    System.out.println("");
            System.out.println("Arrayet etter onbytting:");
            for (int i = 0; i < values.length; ++i) {
                System.out.print(values[i] + " ");
            }
            System.out.println(" "); */
        }
    }
}
