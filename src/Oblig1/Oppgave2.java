package Oblig1;

public class Oppgave2 {

    public static void main(String[] args) {
        int[] a = {3,3,3,4,4,4,4,5,5,5,6,7,8,8,8};
        int b = antallUlikeSortert(a);
        System.out.println(b);
    }

    public static int antallUlikeSortert(int[] a) {

        // Sjekker om arrayet er sortert. Hvis det ikke er det
        // så sendes det en "IllegalStateException"
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                throw new IllegalStateException("Array er ikke sortert");
        }

        // Sjekker om lengde på arrayet er 0
        int teller = 0;
        if (a.length > 1) {
            teller = 1;
            // For-løkke som teller antall forskjellige tall i det sorterte arrayet
            for (int i = 0; i < a.length - 1; i++) {
                int tall = a[i];
                if  (tall != a[i + 1]) {
                    teller++;
                }
            }
        }
        // Returnerer antall ulike tall, evt. 0 hvis array er tomt
        return teller;
    }
}
