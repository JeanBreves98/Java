public class Challenge {

    public static void main(String[] args) {
        double x = 20.00;
        double y = 80.00;
        double z = (x + y) * 100;
        double w = z % 40.00;
        boolean isZero = (w == 0) ? true : false;

        System.out.println(isZero);

    }
}
