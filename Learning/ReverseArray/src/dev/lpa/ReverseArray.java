package dev.lpa;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] x) {
        System.out.printf("Array = %s", Arrays.toString(x));

        int half = x.length / 2;
        int j = x.length - 1;

        for (int i = 0; i < half; i++) {
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp;
            j--;
        }

        System.out.printf("Reversed array = %s", Arrays.toString(x));
    }
}
