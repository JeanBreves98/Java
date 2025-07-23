package dev.lpa;

public class Main {
    public static void main(String[] args) {

        int[] myArray = SortedArray.getIntegers(5);
        int[] descendingOrderArray = SortedArray.sortIntegers(myArray);
        SortedArray.printArray(descendingOrderArray);

    }
}
