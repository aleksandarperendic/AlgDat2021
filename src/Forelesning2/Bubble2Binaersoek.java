package Forelesning2;

import java.util.Arrays;

public class Bubble2Binaersoek {

    public static void main(String[] args) {
        int[] values = {5, 6, 9, 2, 8, 3, 1, 10, 32, 4, 7, 14, 17, 18, 13};
        bubble(values);
        System.out.println(Arrays.toString(values));

        int index1 = binarySearch(values,9);
        System.out.println("Fant tallet 9 på: " + index1);

        int index2 = binarySearchRecursive(values,9,0, values.length-1);
        System.out.println("Fant tallet 9 rekursivt på: "+index2);

        int index3 = binarySearchRecursive(values,11,0, values.length-1);
        System.out.println("Fant tallet 11 rekursivt på: "+index3);
    }

    public static void bubble(int[] values) {
        // To for-løkker:
        // Ytre løkke: sorterer ett tall per gjennomgang
        for (int i = 0; i < values.length; ++i) {

            System.out.println("Arrays før sortering av index: "+i);
            System.out.println(Arrays.toString(values));

            // Indre lække: bobler opp tall til riktig posisjon
            for (int j = values.length - 1; j > i; --j) {
                // Sjekk om tall på posisjon j og (j-1) er sortert riktig
                if (values[j] < values[j - 1]) {
                    System.out.println("Bytter plass på: "+j+" og "+ (j-1));
                    int temp = values[j];
                    values[j] = values[j - 1];
                    values[j - 1] = temp;
                    System.out.println(Arrays.toString(values));
                }
            }
            System.out.println("Sorterte verdier:");
            System.out.println(Arrays.toString(values));
        }
    }

    public static int binarySearch(int[] values, int search_value) {

        // Søke etter 6
        // [ 0 1 2 3 4 5 6 7 8 9 ]
        // [ L       m         r ]
        // Søk i intervalet [L, r]:
        // values.length = 10
        // L = 0
        // r = 9
        // m = (l+r) / 2
        // Tanke: (0.0 + 9.0) / 2 => OBS: Double
        int l = 0;
        int r = values.length-1;
        int m = (l+r) / 2;

        while (l <= r) {
            m = (l+r) / 2;
            // Hvis midten er større:
            if (values[m] > search_value) {
                l = l;
                r = m - 1;
            } else if (values[m] < search_value) {
                l = m + 1;
                r = r;
            } else if (values[m] == search_value) {
                // Funnet plass til verdien eller NaN (f.eks 9/0)
                return m;
            } else {
                System.out.println("Noe er galt.");
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] values, int search_value, int l, int r) {
        int m = (l+r) / 2;

        if (l > r) {
            return -l;
        }
        if (values[m] > search_value) {
            r = m - 1;
            return binarySearchRecursive(values,search_value,l,r);
        } else if (values[m] < search_value) {
            l = m + 1;
            return binarySearchRecursive(values, search_value, l, r);
        } else if ( values[m] == search_value) {
            return m;
        } else {
            return -1;
        }
    }

}

// Intervaller:
// Halvåpent intervall:
// [8,10) => 8,9 => vanlig for-løkke for(int i = 8; i < 10; ++i)
// Lukket intervall:
// [8,10] => 8,9,10 => for (int i = 8; i <= 10; ++i)
// (8,10] => 9,10
