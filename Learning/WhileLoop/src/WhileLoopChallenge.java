public class WhileLoopChallenge {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenCounter = 0;
        int oddCounter = 0;

        while ( number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddCounter++;
                continue;
            }
            System.out.println(number);
            evenCounter++;
            if (evenCounter == 5) {
                break;
            }
        }

        System.out.println("Even numbers found: " + evenCounter);
        System.out.println("Odd numbers found: " + oddCounter);

    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;

    }

}

