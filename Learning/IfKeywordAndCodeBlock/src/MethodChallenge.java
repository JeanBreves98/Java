public class MethodChallenge {
    public static void main(String[] args) {
        String name = "Jean";

        displayHighScorePosition(name, calculateHighScorePosition(1500));
        displayHighScorePosition(name, calculateHighScorePosition(1000));
        displayHighScorePosition(name, calculateHighScorePosition(500));
        displayHighScorePosition(name, calculateHighScorePosition(100));
        displayHighScorePosition(name, calculateHighScorePosition(25));

    }

        public static void displayHighScorePosition (String name,int positon) {
            System.out.println(name + " managed to get into position " + positon + " on the high score list");
        }

        public static int calculateHighScorePosition (int score) {
            int result;

            if (score >= 1000) {
                result = 1;
            } else if (score >= 500) {
                result = 2;
            } else if (score >= 100) {
                result = 3;
            } else {
                result = 4;
            }

            return result;
        }

    }
