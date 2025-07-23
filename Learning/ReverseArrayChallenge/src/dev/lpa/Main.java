package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = RandomArrayGenerator(11);
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] RandomArrayGenerator(int len) {
        int [] randomArray = new int[len];
        Random random = new Random();

        for (int i = 0; i < len; i++) {
            randomArray[i] = random.nextInt(1001);
        }

        return randomArray;
    }

    public static void reverse(int[] x) { // mutating method
        int half = x.length / 2;
        int j = x.length - 1;

        for (int i = 0; i < half; i++) {
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp;
            j--;
        }
    }
}