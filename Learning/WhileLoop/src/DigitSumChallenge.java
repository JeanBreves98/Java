public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1000));
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(-1)); // sum is -1 to indicate the program only accepts values greater than or equals to 0


    }

    public static int sumDigits(int number) {
        int sum = 0;

        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            sum += digit;
        }

        return sum;
    }
}