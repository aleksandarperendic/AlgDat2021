package UkeOppgaver1;


public class Oppgave113 {

    /** OPPGAVER 1.1.3
     * 1) Oppgaven 5 besvart på intelliJ
     * 2) Den sjekker om value < min eller om value < max, altså en sammenligning.
     * 3) Oppgaven 6 besvart på intelliJ
     */

    public static void main(String[] args) {
        int[] a = {567,444};
        int [] res = minmaks(a);

        System.out.println("Min: " + res[0]);
        System.out.println("Max: " + res[1]);

        // Fakultet oppgaven
        int tall = 4;
        long fakultet = fak(tall);
        System.out.println("Fakultet er: "+fakultet);
    }

    public static int[] minmaks(int[] a){
        int min = a[0];
        int max = a[1];

        for (int i=0; i<a.length; i++) {
            int value = a[i];
            if (value < min){
                min = value;
            } else max = value;
            }

        return new int[]{min,max};
    }

    // Metode som beregner fakultet til n
    public static long fak(int n){
        long sum = 1;
        for (int i=1; i<=n; i++){
            sum = sum * i;
        }
        return sum;
    }

}