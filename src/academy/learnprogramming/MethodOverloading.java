package academy.learnprogramming;

public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("Tom", 5);
        System.out.println("New Score is " + newScore);
        calculateScore(5);
        calculateScore(50);
        calculateScore();

        double cent = calcFeetAndInchesToCent(6, -1);
        if (cent <0.0) {
            System.out.println("Invalid Params");
        }
        calcFeetAndInchesToCent(100);
        calcFeetAndInchesToCent(157);


    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score ");
        return 0;
    }

    public static double calcFeetAndInchesToCent(double feet, double inches) {

        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet *12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet," + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCent(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCent(feet, remainingInches);
    }

}
