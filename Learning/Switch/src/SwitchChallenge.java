public class SwitchChallenge {

    public static void main(String[] args) {

        System.out.println(convertToNATO('a'));
        System.out.println(convertToNATO('b'));
        System.out.println(convertToNATO('c'));
        System.out.println(convertToNATO('d'));
        System.out.println(convertToNATO('e'));
        System.out.println(convertToNATO('f'));

    }

    public static String convertToNATO(char character) {

        return switch (character) {
            case 'a' -> character + " is Able";
            case 'b' -> character + " is Baker";
            case 'c' -> character + " is Charlie";
            case 'd' -> character + " is Dog";
            case 'e' -> character + " is Easy";
            default -> character + " is not a valid character";
        };

    }
}
