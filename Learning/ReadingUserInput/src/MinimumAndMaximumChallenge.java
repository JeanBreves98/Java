import java.util.Scanner;

public class MinimumAndMaximumChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int loopCount = 0;
        System.out.println("Please enter a number, or any character to exit:");

        while (true) {
            try {
                double number = Double.parseDouble(scanner.nextLine());
                if (loopCount == 0 || number < min) {
                    min = number;
                } else if (loopCount == 0 || number > max) {
                    max = number;
                }
                loopCount += 1;
            } catch (NumberFormatException badUserData) {
                System.out.println("Loop exited");
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("The maximum number entered was " + max);
            System.out.println("The minimum number entered was " + min);
        } else {
            System.out.println("No valid data entered");
        }

    }

}
