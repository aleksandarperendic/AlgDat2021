package Oblig1;

public class Oppgave5 {

    public static void main(String[] args) {
        char[] a = {'A','B','C','D','E','F','G','I','J'};
        rotasjon(a);
    }

    public static void rotasjon(char[]a) {
        char temp = a[a.length-1];
        for (int i = a.length -1 ; i > 0; i--) {
            a[i] = a[i-1];
        }
        a[0] = temp;
    }
}
