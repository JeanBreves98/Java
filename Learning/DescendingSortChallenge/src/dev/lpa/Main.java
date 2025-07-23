package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = RandomArrayGenerator(10);

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] descendingOrderArray = descendingOrder(array);

        System.out.println(Arrays.toString(descendingOrderArray));
    }

    public static int[] RandomArrayGenerator(int len) {
        int [] randomArray = new int[len];
        Random random = new Random();

        for (int i = 0; i < len; i++) {
            randomArray[i] = random.nextInt(1001);
        }

        return randomArray;
    }

    public static int[] descendingOrder(int[] x) {
        int length = x.length;
        int [] reversedArray = new int[length];
        int j = length - 1;

        for (int i = 0; i < length; i++) {
            reversedArray[i] = x[j];
            j--;
        }

        return reversedArray;
    }
}


