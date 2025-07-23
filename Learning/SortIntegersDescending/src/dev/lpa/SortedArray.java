package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int length) {
        int [] unsortedArray = new int[length];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < length; i++) {
            unsortedArray[i] = s.nextInt();
        }

        return unsortedArray;
    }

    public static int[] sortIntegers(int[] x) {
        Arrays.sort(x);
        int length = x.length;
        int [] reversedArray = Arrays.copyOf(x, length);
        int j = length - 1;

        for (int i = 0; i < length; i++) {
            reversedArray[i] = x[j];
            j--;
        }

        return reversedArray;
    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d%n", i, array[i]);
        }
    }
}
