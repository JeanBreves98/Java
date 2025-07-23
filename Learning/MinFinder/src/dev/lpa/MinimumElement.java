package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner s = new Scanner(System.in);

        return s.nextInt();
    }

    private static int[] readElements(int length) {
        int[] values = new int[length];
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < length; i++) {
            values[i] = reader.nextInt();
        }

        return values;
    }

    private static int findMin(int... x) {
        int len = x.length;
        int [] findMinArray = Arrays.copyOf(x, len);
        Arrays. sort(findMinArray);
        int min = findMinArray[0];

        return min;
    }
}
