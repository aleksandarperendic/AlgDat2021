package Forelesning2;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int[] a = {1,9,2,4,7,6};
        System.out.println("Array: "+Arrays.toString(a));
        System.out.println("OPPGAVE:");
        bubble(a);
    }

    static void bubble(int[] a){

        for (int i=0; i<a.length-1;++i) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
            System.out.print(a[0]);
        }
            for (int j=1;j<a.length;++j){
                System.out.print(", "+a[j]);
            }
            System.out.println();
        }
    }

