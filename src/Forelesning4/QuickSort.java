package Forelesning4;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        System.out.println("Testing");

        int[] values = {8, 5, 3, 6, 5, 2, 9};

        System.out.println("Usortert" + Arrays.toString(values));

        quicksort(values,0, values.length-1);

        System.out.println("Sortert:" + Arrays.toString(values));
    }

    static void quicksort(int[] values, int left, int right) {
        // Hvis vi ikke har noe intervall igjen (l==r)
        // så slutter vi rekursjonen
        if(left >= right) {
            System.out.println("Slutter rekursjon");
            return;
        }
        // 1. Se på midterste verdi i arrayet til slutten.
        // - se på verdien. Dette er skilleverdien (Pivot)
        int m = (left+right) / 2;
        int pivot = values[m]; // Ta vare på midt-verdien i en temp-variabel
        values[m] = values[right]; // Overskrif midt-variabelen med siste verdi i arrayet
        values[right] = pivot; // Overskriv siste verdi i arrayet med temp-variabelem (midten)
        System.out.println("Pivot er indeks: "+ m + " verdi " + pivot);
        System.out.println("Flytter pivot: " + m + " - " + right);

        // 2. Partisjoner arrayet fra start til "nest siste kort" (siste kort er midt-kortet)
        // - Flytt alt som er større enn eller lik skilleverdi til høyre
        // - Flytt alt som er mindre enn skilleverdi til venstre
        // - Ta vare på indexen til den siste verdien som er mindre enn skilleverdi
        int index = partition(values, pivot, left,right-1);


        // 3. Flytt skilleverdien (sist i arrayet) tilbake til riktig sortert plass
        // (rett til høyre for siste verdi som er minde enn skilleverdi i punkt 2)
        int sorted_index = index + 1;
        int temp = values[sorted_index];
        values[sorted_index] = values[right];
        values[right] = temp;
        System.out.println("Flytter pivot tilbake til plass: " + sorted_index);

        // 4. Gjenta for høyre sub-array og venstre sub-array
        System.out.println("Rekursjon venstre sub-array: ");
        quicksort(values, left, sorted_index-1);
        System.out.println("Rekursjon høyre sub-array: ");
        quicksort(values, sorted_index+1, right);
    }

    /**
     * Partisjonerer arrayet basert på en skilleverdi, pivot.
     * Vi plassere alle verdier som er mindre enn pivot til venstre
     * og alle verdier som er større eller lik til høyre
     * @param values
     * @param left
     * @param right
     * @param pivot
     * @return
     */
    static int partition(int[] values,int pivot, int left, int right) {
        int l = left;
        int r = right;

        // Kjør løkke helt til høyre og venstre peker møtes på midten.
        // Da har vi funnet riktig plassering av pivot.
        while (l < r) {
            // Flytt venstre-peker mot høyre så lenge vi har tall
            // som er riktig sortert i forhold til pivot
            while (values[l] < pivot && l <= r) {
                l = l+1;
            }
            // Gjør  tilsvarende for høyre-peker: Flytt mot venstre
            // så lenge vi har tall som er større eller lik pivot
            while (values[r] >= pivot && l <= r) {
                r = r-1;
            }
            // Nå har vi at values[l] >= pivot og values[r] < pivot
            // Disse kan byttes!
            if (l < r) {
                System.out.println("Bytter om: " + l + " - " + r);
                int temp = values[r];
                values[r] = values[l];
                values[l] = temp;
                l = l+1;
                r = r-1;
            }
        }

        System.out.println("Siste tall mindre enn pivot er på indeks: " + (l+1));
        return l-1;
    }

}
