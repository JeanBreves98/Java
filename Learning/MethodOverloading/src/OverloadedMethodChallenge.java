public class OverloadedMethodChallenge {
    public static void main(String[] args) {
    // 1 inch = 2.54 cm
    // 1 foot = 12 inches
        System.out.println("210 inches = " + convertToCentimeters(210) + " centimeters");
        System.out.println("6 feet and 1 inch = " + convertToCentimeters(6,1) + " centimeters");
    }

    public static double convertToCentimeters(int heightInInches) {
        double centimeters = (double) (heightInInches * 2.54);
        return centimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {
        int inches =+ remainingHeightInInches + (heightInFeet * 12);
        return convertToCentimeters(inches);
    }
}