import java.util.Scanner;

public class MonthCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number");
        int day = input.nextInt();
        if (day >= 1 && day <= 31)
            System.out.println("It is January");
        else if (day >= 32 && day <= 59)
            System.out.println("It is February");
        else if (day >= 61 && day <= 90)
            System.out.println("It is March");
        else if (day >= 91 && day <= 120)
            System.out.println("It is April");
        else if (day >= 121 && day <= 151)
            System.out.println("It is May");
        else if (day >= 152 && day <=181)
            System.out.println("It is June");
        else if (day >= 182 && day <=212)
            System.out.println("It is July");
        else if (day >= 213 && day <= 243)
            System.out.println("It is August");
        else if (day >= 244 && day <= 273)
            System.out.println("It is September");
        else if (day >= 274 && day <= 304)
            System.out.println("It is October");
        else if (day >= 305 && day <= 334)
            System.out.println("It is November");
        else if (day >= 335 && day <= 365)
            System.out.println("It is December");
        //the leap year was not taken into account, if it would be, so the number of days would have become bigger on 1 after February.
    }
}

