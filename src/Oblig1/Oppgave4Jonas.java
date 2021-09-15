package Oblig1;

import java.util.Arrays;

public class Oppgave4Jonas {

    public static void main(String[] args) {

        int[] array = new int[] {2, 1, 3, 4, 5, 6};

        int evenPnt = 0;

        // Arranging Even and Odd numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 || array[i] % 2 == -1) {
                swap(array, evenPnt, i);
                evenPnt++;
            }
        }

        // Sorting even numbers
        sort(array, 0, evenPnt);

        // Sorting Odd numbers
        sort(array, evenPnt, array.length);

        for (int i : array) {
            System.out.println(i+", ");
        }
    }
    public static void sort(int[] arr, int min, int max) {
        for (int i = min; i < (max - 1); i++) {
            for (int j = i + 1; j < max; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}


