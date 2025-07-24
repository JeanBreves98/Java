package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        boolean forward = true;

        addPlace(placesToVisit, new Place("Adelaide", 1374));
        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));
        addPlace(placesToVisit, new Place("Sydney", 0));

        var iterator = placesToVisit.listIterator();

        menu();

        while (running) {
            if(!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()) {
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }
            String input = scanner.nextLine();
            input = input.toUpperCase().substring(0, 1);

            switch (input) {
                case "F":
                    System.out.println("Going forward...");
                    if (!forward) {                     // Reversing direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();            // Adjusts position
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("Going backward...");
                    if (forward) {                     // Reversing direction
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();            // Adjusts position
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println("Listing places...");
                    System.out.println(placesToVisit);
                    break;
                case "M":
                    menu();
                    break;
                case "Q":
                    System.out.println("Quitting...");
                    running = false;
                    break;
                default:
                    System.out.println("Option not available");
                    System.out.println("Try again");
                    break;
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        int matchedIndex = 0;
        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p : list) {
            if(p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        for (var listPlace: list){
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void menu() {
        String textBlock = """
Available actions (select word or letter):
(F)orward
(B)ackward
(L)ist places
(M)enu
(Q)quit""";

        System.out.println(textBlock);
    }

}
