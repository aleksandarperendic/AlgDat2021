package UkeOppgaver2;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        // OPPGAVE 1.2.13 - 1,2
        int[] a = {5,8,1,3,99,31,11};
        int[] b = Tabell.nestMaksTre(a);
        System.out.println("M og NM er: "+Arrays.toString(b));
    }
}
