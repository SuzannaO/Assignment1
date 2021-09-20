import java.util.Scanner;

public class MilesPerHour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter kilometres");
        double kilometresPerHour = input.nextInt();
        System.out.println((long) toMilesPerHour(kilometresPerHour));
    }

    public static double toMilesPerHour(double kilometresPerHour) {
        if (kilometresPerHour < 0) {
            return -1;
        } else {
            return kilometresPerHour * 0.621;
        }
    }
}
