package Forelesning1;

public class MyFirstSort {

    public static void main(String[] args) {
        System.out.println("Hello algdat");

        int values[] = {1, 7, 2, 4, 6, 9};


        int max_index= findMax(values);
        System.out.println("Største verdi ligger på plass: " + max_index+" og har verdi: "+values[max_index]);
    }

    /**
     * Findmax - finner index til største tall i et array
     */

    public static int findMax(int[] values){
        // Initialiser ved å se på første "kort"
        // Dette er det største tallet jeg har funnet så langt
        int index = 0;
        int max_value = values[0];

        // Sjekk at grensene for løkken er riktig.
        for(int i=1; i<values.length; ++i){
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
