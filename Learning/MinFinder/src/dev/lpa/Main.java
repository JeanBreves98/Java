package dev.lpa;

public class Main {
    public static void main(String[] args) {
        int length = MinimumElement.readInteger();
        int[] array = MinimumElement.readElements(length);
        int minimum = MinimumElement.findMin(array);

        System.out.println(minimum);


    }
}
