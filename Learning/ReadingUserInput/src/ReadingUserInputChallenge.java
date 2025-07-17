import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 valid numbers");
        int count = 1;
        double sum = 0;

        while (count <= 5) {
            System.out.println("Enter number #" + count + ":");
            try {
//                int number = Integer.parseInt(scanner.nextLine());
                double number = Double.parseDouble(scanner.nextLine());
                count++;
                sum += number;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
            }
        }

        System.out.println("The sum of the numbers entered is " + sum);
    }
}
