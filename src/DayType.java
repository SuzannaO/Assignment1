import java.util.Scanner;

public class DayType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write the day ot the week");
        int dayNumber = input.nextInt();
        switch (dayNumber) {
            case 1, 2, 3, 4, 5:
                System.out.println("It is a working day");
                break;
            case 6, 7:
                System.out.println("It is holiday");
                break;
            default:
                System.out.println("Please add correct verification in the code!");
                break;
        }
    }
}
