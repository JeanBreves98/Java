package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class GroceryList {
    private static ArrayList<String> groceryList = new ArrayList<>();
    private static String[] temp;

    public static void addItems(String [] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i].trim();
            }

           groceryList.addAll(Arrays.asList(array));
           groceryList.sort(Comparator.naturalOrder());
           removeDuplicates();

           System.out.println("Updated grocery list " + GroceryList.getGroceryList());

    }

    public static void removeItems(String [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }

        for (String element: array) {
            if (groceryList.contains(element)) {
                groceryList.remove(element);
            }
        }

        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Updated grocery list " + getGroceryList());
    }

    private static void removeDuplicates() {
        ArrayList<String> cleanArrayList = new ArrayList<>();

        for (String element : groceryList){
            if (!cleanArrayList.contains(element)) {
                cleanArrayList.add(element);
            }
        }

        groceryList.clear();
        groceryList.addAll(cleanArrayList);
        cleanArrayList.clear();
    }


    private static ArrayList<String> getGroceryList() {
        return groceryList;
    }

}
