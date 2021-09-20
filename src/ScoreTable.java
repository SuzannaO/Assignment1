
public class ScoreTable {
    public static void main(String[] args) {
        displayHighScorePosition();
    }
    public static void displayHighScorePosition() {
        String name1 = "Smith";
        String name2 = "Wallis";
        String name3 = "Tompson";
        String name4 = "Johnson";
        // I was first trying to enter int scores, but than everything worked just entering calculateHighScorePosition(..) from the second method
       // int score1 = Integer.parseInt("1500");
        // int score2 = Integer.parseInt("900");
       // int score3 = Integer.parseInt("400");
       // int score4 = Integer.parseInt("50");
        System.out.println("Position: " + name1 + " managed to get into position " + calculateHighScorePosition(1500) + " on the high score table");
        System.out.println("Position: " + name2 + " managed to get into position " + calculateHighScorePosition(900) + " on the high score table");
        System.out.println("Position: " + name3 + " managed to get into position " + calculateHighScorePosition(400) + " on the high score table");
        System.out.println("Position: " + name4 + " managed to get into position " + calculateHighScorePosition(50) + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }


    }
}

