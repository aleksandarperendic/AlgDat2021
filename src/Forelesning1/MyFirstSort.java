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

    /*
    Finner index til største og nest største tall i et array, men søker
    bare innenfor tallene i [fra,til).
     */

    public static int findTwoMaxIndices(int[] values, int fra, int til){

        // Test at grensene gir mening

        if (til-fra<2) {
            throw new ArrayIndexOutOfBoundsException("Ikke nok tall.");
        }

        if (fra < 0) {
            throw new ArrayIndexOutOfBoundsException("Fra er negativ.");
        }

        if (til < 2) {
            throw new ArrayIndexOutOfBoundsException("Til er ikke lang nok.");
        }

        // Tester at vi ikke har for stor verdi
        // values = {9}; ==> values.length = 1
        // Indekser:             0  1  2  3  4  5
        // values.length =       1  2  3  4  5  6
        // Starter med verdiene {1, 7, 2, 4, 6, 9}

        if (til > values.length) {

        }


        // Initialiser ved å se på første to verdier
        // Dette er det største og nest største tallene jeg har funnet så langt
        int index_max = fra;
        int index_nestmax = fra +1;

        int max_value = values[fra];
        int nest_max_value = values[fra+1];

        // Hvis nest_max_value har en verdi som er større en variabel max_value
        // så må vi bytte dem.
        if (max_value < nest_max_value) {
            // Disse burde refaktoreres i en swap metode for å gjøre koden
            // mer lesbar
            int temp = max_value;
            max_value = nest_max_value;
            nest_max_value = temp;

            temp = index_max;
            index_max = index_nestmax;
            index_nestmax = temp;
        }

        // Status så langt:
        // Vi har sett på de to første elementene {1, 7}
        // max_value: 7; index_max = 1;
        // nest_max_value = 1; index_nestmax = 0;

        // Sjekk at grensene for løkken er riktig. [fra,til)
        for(int i=fra+2; i<til; ++i){

            //Tilfelle 1: nytt største max
            if (values[i] > max_value){
                int temp = max_value; // Tallet 7
                max_value = values[i]; // f.eks 14
                nest_max_value = temp; // Tallet 7

                // Oppdater indeksene
                temp = index_max;
                index_max = i;
                index_nestmax = temp;
            } else if (values[i] > nest_max_value){
                nest_max_value = values[i];
                index_nestmax = i;
            } else {
                // Ingenting, max og next_max er større begge to
            }

            // Sjekk om vi har funnet nytt største tall
            if (values[i] > max_value){
                max_value = values[i];
                index = i;
            }
        }
        // Returnerer index
        return index;
    }
}
