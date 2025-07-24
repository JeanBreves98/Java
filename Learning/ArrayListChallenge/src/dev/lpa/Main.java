package dev.lpa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Available actions:");

        while (running) {
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to list (comma delimited list)");
            System.out.println("2 - to remove any items (comma delimited list)");
            System.out.println("Enter a number for which action you want to do:");
            String input = scanner.nextLine();

            switch (input) {
                case "0":
                    System.out.println("Shutting down...");
                    running = false;
                    break;
                case "1":
                    System.out.println("Enter items:");
                    String add = scanner.nextLine();
                    String [] addArray = (add.split(","));
                    GroceryList.addItems(addArray);
                    break;
                case "2":
                    System.out.println("Remove items:");
                    String remove = scanner.nextLine();
                    String[] removeArray = remove.split(",");
                    GroceryList.removeItems(removeArray);
                    break;
                default:
                    System.out.println("Action not available");
                    break;
            }
        }
    }
}