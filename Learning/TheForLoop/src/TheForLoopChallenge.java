public class TheForLoopChallenge {

    public static void main(String[] args) {

        System.out.println("Found " + primeCounter(10, 50) + " prime numbers between 10 and 50");

    }

    public static int primeCounter(int lowerLimit, int upperLimit) {

        int counter = 0;

        for (int i = lowerLimit;  i <= upperLimit; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                counter += 1;
//                if (counter == 3) {
//                    break;
//                }
            }

        }

        return counter;
    }

    public static boolean isPrime (int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
