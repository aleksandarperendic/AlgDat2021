package Oblig1;

import java.util.Arrays;

public class Oppgave4SisteF {

    public static void main(String[] args) {
        int[] b = {7, 2, 9, 4, -4, 5, 8, 12, -11, -13};
        delsortering(b);
        System.out.println(Arrays.toString(b));

    }

    public static void delsortering(int[] a) {
        int l = 0;
        int x = 0;
        int z = 0;
        int left = 0;
        int right = 0;

        for (int j = 0; j <a.length; j++) {
            if(a[j]%2!=0) {
                left++;
            } else right++;
        }

        int[] sortertodde = new int[left];
        int[] sortertpar = new int[right];

        while (l < a.length) {
            while (a[l] % 2 != 0) {
                sortertodde[z] = a[l];
                z++;
                break;
            } while (a[l] % 2 == 0) {
                sortertpar[x] = a[l];
                x++;
                break;
            }
            l++;
        }


        int q = 0;
        int lala = 0;
        while (q < a.length) {
            while (q < left) {
                a[q] = sortertodde[q];
                q++;
                while (q >= left && q < a.length) {
                    a[q] = sortertpar[lala];
                    q++;
                    lala++;
                }
            }
        }

     //   System.out.println(Arrays.toString(a));
    }
}
