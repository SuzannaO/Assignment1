import java.util.Random;
import java.util.Scanner;

public class GroupAssignment {
    public static void main(String[] args) {
        chooseLanguage();
        enterPin();
        chooseAccount();
        operationsMenu();
        receiptOptions();
    }

    public static void operationsMenu() {
        System.out.println("Choose an operation");
        System.out.println("Check balance (B)");
        System.out.println("Cash withdraw (W)");
        System.out.println("Cash withdraw in USD ($)");
        System.out.println("Deposit (D)");
        Scanner input = new Scanner(System.in);
        char operation = input.next().charAt(0);
        switch (operation) {
            case 'B':
                Random random = new Random();
                int balance = random.nextInt(10000);
                System.out.println("Your balance is " + balance + " Euro");
                break;
            case 'W':
                Random random1 = new Random();
                int balance1 = random1.nextInt(10000);
                System.out.println("Please enter an amount you want to withdraw");
                Scanner withdraw = new Scanner(System.in);
                int balance2 = withdraw.nextInt();
                if (balance1 < balance2) {
                    System.out.println("No sufficient funds");
                } else {
                    System.out.println("Your new balance is" + (balance1 - balance2) + "Euro");
                }
                break;
            case '$':
                Random random2 = new Random();
                int balance3 = random2.nextInt(10000);
                System.out.println("Please enter an amount you want to withdraw in USD");
                Scanner withdraw2 = new Scanner(System.in);
                int balance4 = withdraw2.nextInt();
                if (balance3 < balance4) {
                    System.out.println("No sufficient funds");
                } else {
                    System.out.println(" " + (balance4*1.16) + " USD has been withdrawn. " +
                            "Your new balance is" + (balance3 - balance4*1.16) + "Euro");
                }
                break;
            case 'D':
                Random random3 = new Random();
                int balance5 = random3.nextInt(10000);
                System.out.println("Insert money for deposit");
                Scanner cash = new Scanner(System.in);
                int deposit = cash.nextInt();
                System.out.println("Your balance now is " + (balance5 + deposit) + "Euro");


        }
    }

    public static void receiptOptions() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please decide either you need a receipt or not");
        char receipt = input.next().charAt(0);
        switch (receipt) {
            case 'Y':
                System.out.println("Printing receipt");
                break;
            case 'N':
                System.out.println("No receipt to print");
                break;
        }
    }

    public static void chooseAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select account to work in: 1-primary account, 2-savings, 3-other");
        int account = input.nextInt();
        switch (account) {
            case 1:
                System.out.println("You have entered your primary account \n");
                break;
            case 2:
                System.out.println("You have entered your savings account \n");
                break;
            case 3:
                System.out.println("You have entered other account \n");
                break;
        }

    }


    public static void enterPin() {
        Scanner input = new Scanner(System.in);
        int pin = 1234;
        int tries = 0;
        int entry;
        while (true) {
            System.out.println("Enter your PIN");
            entry = input.nextInt();

            if (entry == pin) {
                System.out.println("PIN accepted \n");
                break;
            } else if (tries >= 2) {
                System.out.println("You have run out of tries, the card has been blocked \n");
                break;
            }
            tries++;

        }
    }

    public static void chooseLanguage() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select language. 1-LV, 2-ENG, 3-RUS");
        int language = input.nextInt();
        switch (language) {
            case 1:
                System.out.println("Izvēlieties galveno izvelni \n");
                break;
            case 2:
                System.out.println("Choose from the main menu \n");
                break;
            case 3:
                System.out.println("Выберите операцию \n");
                break;
        }

    }

}
