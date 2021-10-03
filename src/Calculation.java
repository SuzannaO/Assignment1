import java.util.Scanner;

public class Calculation {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write the first number");
        int number1 = input.nextInt();
        System.out.println("Write the second number");
        int number2 = input.nextInt();

        System.out.println("User option's result");
        char userOption = input.next().charAt(0);
        switch (userOption) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '%':
                System.out.println(number1 % number2);
                break;
            case 'p':
                System.out.println(number1 + "," + number2);
                break;
            case 'b':
                if (number1 > number2)
                System.out.println(number1 + " > " + number2);
                else
                    System.out.println(number2 + " > " + number1);
                break;
            case 's':
                if (number1 < number2)
                    System.out.println(number1 + " < " + number2);
                else
                System.out.println(number2 + " < " + number1);
                break;

        }

    }
}
