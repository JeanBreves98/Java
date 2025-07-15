public class SwitchExpressionChallenge {
    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfWeek(int number) {

        String day = switch (number) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> {yield "Tuesday";}
            case 3 -> {yield "Wednesday";}
            case 4 -> {yield "Thursday";}
            case 5 -> {yield "Friday";}
            case 6 -> {yield "Saturday";}
            default -> {yield "Invalid day";}
        };

        System.out.println(number + " stands for " + day);
    }

    public static void printWeekDay(int number) {

        String day = "Invalid day";

        if (number == 0) {
            day = "Sunday";
        } else if (number == 1) {
            day = "Monday";
        } else if (number == 2) {
            day = "Tuesday";
        } else if (number == 3) {
            day = "Wednesday";
        } else if (number == 4) {
            day = "Thursday";
        } else if (number == 5) {
            day = " Friday";
        } else if (number == 6) {
            day = "Saturday";
        } else {
            day = "Invalid day";
        }

        System.out.println(number + " stands for " + day);
    }

}
