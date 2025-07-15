public class Sum3And5Challenge {

    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;

        System.out.println("The numbers found were:");

        // Only sums and prints the first 5 numbers
        for (int i = 1; i <= 1000 && counter < 5; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                sum += i;
                counter++;
            }
        }

        System.out.println("Sum is " + sum);
        System.out.println(counter + "numbers found");
    }
}