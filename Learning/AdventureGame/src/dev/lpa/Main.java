package dev.lpa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String myLocations = """
//                lake,at the edge of Lake Gi,E:ocean,W:forest,S:well house,N:cave
//                ocean,on Gi's beach before an angry sea,W:lake
//                cave,at the mouth of Gi's cave,E:ocean,W:forest,S:lake
//                """;

//        AdventureGame game = new AdventureGame(myLocations);
        AdventureGame game = new AdventureGame();
        game.play("road");

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String direction = scanner.nextLine().trim().toUpperCase().substring(0, 1);
            if (direction.equals("Q")) {
                System.out.println("Quitting...");
                break;
            }
            game.move(direction);
        }
    }
}
