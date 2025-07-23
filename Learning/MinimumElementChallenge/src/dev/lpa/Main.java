package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = readIntegers();
        int minimum = findMin(myArray);

        System.out.println(minimum);

    }

    public static int[] readIntegers() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a list of ynumbers separated by commas");
        String input = s.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        System.out.println(Arrays.toString(values));

        return values;
    }

    public static int findMin(int... x) {
        int len = x.length;
        int [] findMinArray = Arrays.copyOf(x, len);
        Arrays. sort(findMinArray);
        int min = findMinArray[0];

        return min;
    }
}
