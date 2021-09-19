import java.util.Scanner;

public class Salary {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter working hours");
        int workingHoursInDay = input.nextInt();
        if (workingHoursInDay > 24 || workingHoursInDay < 0)
            System.out.println("The meaning of working hours is invalid");
        if (workingHoursInDay > 0 && workingHoursInDay <= 8)
            System.out.println("The salary is " + workingHoursInDay * 10 + "Euro");
    else {
        if (workingHoursInDay >8 && workingHoursInDay <24)
            System.out.println("The salary is " + (80 + (workingHoursInDay-8)*15) + "Euro");
    }

    }
}
