import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write the day");
        int day = input.nextInt();
        System.out.println("Please write the month");
        int month = input.nextInt();
        System.out.println("Please write the year");
        int year = input.nextInt();
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1)
            System.out.println("The date is invalid");
        else
            System.out.println("Please select the date formatting. 1 - YYYY/MM/DD, 2 - YYYY.MM.DD");
        int format = input.nextInt();
        if (format == 1)
            System.out.println("Your date is" + " " + year + "/" + month + "/" + day);
        if (format == 2) {
            System.out.println("Your date is" + " " + year + "." + month + "." + day);
        }
    }
}


